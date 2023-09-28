class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         ArrayList<Integer> list = new ArrayList<>();
         int row = matrix.length;
         int col = matrix[0].length;
         int count = 0;
         int total = row * col;
         int startrow = 0;
         int startcol = 0;
         int endrow = row-1;
         int endcol = col-1;
         while(count < total){
             //print starting row 
             for(int i=startcol; count<total && i<=endcol; i++)
             em {
                 list.add(matrix[startrow][i]);
                 count++;
             }
             startrow++;
             //print ending column 
             for(int i=startrow; count<total && i<=endrow; i++)
             {
                 list.add(matrix[i][endcol]);
                 count++;
             }
             endcol--;
             //print ending row
             for(int i=endcol; count<total && i>=startcol; i--)
             {
                 list.add(matrix[endrow][i]);
                 count++;
             }
             endrow--;
             //print strating column 
             for(int i=endrow; count<total && i>=startrow;i--)
             {
                 list.add(matrix[i][startcol]);
                 count++;
             }
             startcol++;
         }
         return list;
    }
}