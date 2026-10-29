class Solution {
    int func(int []arr,int pages) {
        int stu=1;
        int pagesStu=0;
        for(int i=0;i<arr.length;i++) {
            if(pagesStu+arr[i]<=pages) {
                pagesStu+=arr[i];
            }
            else{
                stu++;
                pagesStu=arr[i];
            }
        }
        return stu;
    }
    public int splitArray(int[] nums, int k) {
        int low =0;
        int high =0;
        for(int n:nums) {
            low=Math.max(low,n);
            high+=n;
        }
        while(low<=high){
            int mid=(low+high)/2;
            int split=func(nums,mid);
            if(split>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}