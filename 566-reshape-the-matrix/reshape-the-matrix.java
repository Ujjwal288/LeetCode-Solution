class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) {
            return mat;
        }
        int ans [] = new int [n*m];
        int k=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                ans[k++] = mat[i][j];
            }
        }
        int arr [][] = new int [r][c];
        k=0;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j] = ans[k++];
            }
        }
        return arr;
        
    }
}