class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int m = matrix.length;
         int n = matrix[0].length;
         ArrayList<Integer> answer = new ArrayList<>();
         int[][] dir = {{1,0}, {0,-1}, {-1,0}, {0,1}};
         int[][] visit = new int[m][n];
         for(int i = 0; i < m; i++) {
             Arrays.fill(visit[i], 0);
         }
        Consumer<int[]> traverse = (coord) -> {
            int index = 3;
        Stack<int[]> stack = new Stack<>();
        stack.push(coord);
        while(!stack.isEmpty()) {
            coord = stack.pop();
            if(coord[0] >= m || coord[0] < 0 || coord[1] >= n || coord[1] < 0 || visit[coord[0]][coord[1]] == 1) {
                continue;
            }
            answer.add(matrix[coord[0]][coord[1]]);
            visit[coord[0]][coord[1]] = 1;
            int[] coord2 = {coord[0] + dir[index][0], coord[1] + dir[index][1]};
            if(coord2[0] >= m || coord2[0] < 0 || coord2[1] >= n || coord2[1] < 0 || visit[coord2[0]][coord2[1]] == 1) {
                index = (index + 1) % 4;
            }
            coord2 = new int[]{coord[0] + dir[index][0], coord[1] + dir[index][1]};
            stack.push(coord2);
        }
    };
    traverse.accept(new int[]{0,0});
    return answer;
    }
}