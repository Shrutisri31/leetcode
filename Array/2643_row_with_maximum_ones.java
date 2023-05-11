 
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[]=new int [2];
        int maxSum=0;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0) 
                {
                    sum+=1;
                }
            }
                if(sum>maxSum)
                {
                   maxSum=sum;
                   row=i;
                }
            }
        res[0]=row;
        res[1]=maxSum;
        return res;
    }
}
