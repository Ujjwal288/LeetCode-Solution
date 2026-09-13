class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int freq [] = new int [n+1];
        for(int num : nums) {
            freq[num]++;
        }
        int duplicate = -1;
        int missing = -1;
        for(int j=1;j<=n;j++) {
            if(freq[j] == 2) {
                duplicate = j;
            }
            if(freq[j] == 0) {
                missing = j;
            }
        }
        return new int [] {duplicate , missing};
    }
}