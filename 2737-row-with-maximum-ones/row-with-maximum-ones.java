class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCount=-1;
        int index=-1;
        for(int i=0;i<mat.length;i++) {
            int rowCount=0;
            for(int j=0;j<mat[i].length;j++) {
                rowCount+=mat[i][j];
            }
            if(rowCount>maxCount) {
                maxCount=rowCount;
                index=i;
            }
        }
        return new int[] {index,maxCount};
    }
}