class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerbound(nums,target);
        if(first == nums.length || nums[first]!=target) {
            return new int []{-1,-1};
        }
        int last = upperbound(nums,target)-1;
        return new int []{first,last};
    }
    public int lowerbound(int []nums,int x){
        int low =0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high) {
            int mid =(low+high)/2;
            if(nums[mid]>=x){
                ans =mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperbound(int []nums,int x){
        int low =0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high) {
            int mid =(low+high)/2;
            if(nums[mid]>x){
                ans =mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}