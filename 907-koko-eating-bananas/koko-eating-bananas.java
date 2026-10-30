class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = 0;
        for(int n:piles) {
            high = Math.max(high,n);
        }
        int ans = high;
        while(low<=high) {
            int mid = (low+high)/2;
            if(canEat(piles,mid,h)) {
                ans = mid;
                high = mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    boolean canEat(int []piles,int k,int h) {
        long hours =0;
        for(int pile:piles) {
            hours+=(pile+(long)k-1)/k;
        }
        return hours<=h;
    }
}