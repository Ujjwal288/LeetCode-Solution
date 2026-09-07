class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondmax =Long.MIN_VALUE ;
        long thirdmax = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]> max) {
                thirdmax = secondmax;
                secondmax = max;
                max = nums[i];
            }
            else if(nums[i] > secondmax && nums[i] != max) {
                thirdmax = secondmax;
                secondmax = nums[i];
            }
            else if (nums[i] !=max && nums[i]!=secondmax && nums[i] > thirdmax) {
                thirdmax = nums[i];
            }
            
        }
        return thirdmax == Long.MIN_VALUE ? (int)max : (int)thirdmax ;
    }
}