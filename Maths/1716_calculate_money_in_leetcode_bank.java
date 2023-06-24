class Solution {
    public int totalMoney(int n) {
       int count = n/7;
       int res = 0;
        for(int i=1;i<=count;i++){
            res = res + 7*(i+3);
        }
        for(int i=(7*count);i<n;i++){
            res = res + ++count;
        }
        return res;
    }
}
