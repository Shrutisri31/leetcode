class Solution {
    public int[] findColumnWidth(int[][] grid) {
       int C = grid[0].length;
        int[] ans = new int[C];
        for (int c = 0, R = grid.length; c < C; ++c)
        {
            for (int r = 0; r < R; ++r) {
                ans[c] = Math.max(ans[c], Integer.toString(grid[r][c]).length());
            }
        }
        return ans; 
    }
}
