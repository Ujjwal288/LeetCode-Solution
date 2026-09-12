class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> list1= new HashSet <> ();
        HashSet <Integer> result= new HashSet <> ();
        for(int num : nums1) {
            list1.add(num);
        }
        for(int num : nums2) {
            if(list1.contains(num)) {
                result.add(num);
            }
        }
        int [] ans = new int [result.size()];
        int i=0;
        for(int num : result) {
            ans[i++] = num;
        }
        return ans;
    }
}