class Solution {
    boolean canWePlace(int [] arr, int distance , int m) {
        int count=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]-last>=distance) {
                count++;
                last=arr[i];
            }
            if(count>=m) {
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low =0;
        int high =position[n-1]-position[0];
        int ans=0;
        while(low<=high) {
            int mid=(low+high)/2;
            if(canWePlace(position,mid,m) == true) {
                ans =mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
}