class Solution {
    public boolean judgeSquareSum(int c) {
        int start=0;
        int end=(int)Math.sqrt(c);
        while(start<=end)
        {
           int ans=(start*start)+(end*end);
            if(ans<0){
                end--;
            }
            if(ans==c){
                return true;
            }
             if(ans<c) {
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}
