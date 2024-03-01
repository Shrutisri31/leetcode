class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
     int m = matrix.length, n = matrix[0].length, mx[] = new int[n];
    for (int j = 0; j < n; j++) {
        int max = 0;
        for (int i = 0; i < m; i++)
            max = Math.max(max, matrix[i][j]);
        mx[j] = max;
    }
    for (int j = 0; j < n; j++) {
        for (int i = 0; i < m; i++) {
            if (matrix[i][j] == -1) matrix[i][j] = mx[j];
        }
    }
    return matrix;   
    }
}