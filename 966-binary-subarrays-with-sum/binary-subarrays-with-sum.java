class Solution {
    int atMost(int []nums , int goals) {
        if(goals <0) return 0;
        int left =0;
        int right =0;
        int sum =0;
        int count =0;
        int n =nums.length;
        while(right<n) {
            sum+=nums[right];
            while(sum>goals) {
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal) - atMost(nums,goal-1);
    }
}