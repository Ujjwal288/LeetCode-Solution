class Solution {
    int sumOfD(int [] arr,int mid) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=(int)Math.ceil((double)arr[i]/mid);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int n : nums) {
            high=Math.max(high,n);
        }
        int ans =high;
        while(low<=high) {
            int mid=(low+high)/2;
            if(sumOfD(nums,mid)<=threshold) {
                ans = mid;
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}