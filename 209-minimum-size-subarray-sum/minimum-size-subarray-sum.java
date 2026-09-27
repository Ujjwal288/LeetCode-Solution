class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int sum =0;
        int minLength = nums.length+1;
        for(int rigth =0;rigth<nums.length;rigth++) {
            sum+=nums[rigth];
            while(sum>=target) {
                minLength = Math.min(minLength,rigth-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minLength == nums.length+1) {
            return 0;
        }
        else {
            return minLength;
        }
    }
}