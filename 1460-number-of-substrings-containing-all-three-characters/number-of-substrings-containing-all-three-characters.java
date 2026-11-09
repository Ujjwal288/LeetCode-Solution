class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,right=0,count=0;
        int [] freq = new int [3];
        while(right<s.length()) {
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0) {
                count+=s.length()-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return count;
    }
}