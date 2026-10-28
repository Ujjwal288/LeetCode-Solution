class Solution {
    int findDays(int []weights,int cap) {
        int day =1, load=0;
        for(int i=0;i<weights.length;i++) {
            if(load+weights[i]>cap) {
                day+=1;
                load=weights[i];
            }
            else {
                load+=weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int n : weights){
            low =Math.max(low,n);
            high+=n;
        }
        while(low<=high) {
            int mid = (low+high)/2;
            int noOfDays = findDays(weights, mid);
                if(noOfDays <=days) {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
        }
        return low;
    }
}