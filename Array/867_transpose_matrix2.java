class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        int r = matrix.length;
        int c= matrix[0].length;
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
