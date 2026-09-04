class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList <> ();
        int n = matrix.length;
        int m = matrix[0].length;
        int top =0;
        int bottom = n-1;
        int left = 0;
        int rigth = m-1;
        while(top<=bottom && left <=rigth) {
            for(int i=left;i<=rigth;i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                ans.add(matrix[i][rigth]);
            }
            rigth--;
            if(top<=bottom) {
                for(int i=rigth;i>=left;i--) {
                    ans.add(matrix[bottom][i]);
                }
            bottom--;
            }
            if(left <= rigth) {
                for(int i=bottom;i>=top;i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}