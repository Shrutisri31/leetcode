class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int temp=0,rev=0;
        while(n>0){
            temp = n%10;
             rev = rev*10 + temp;
            n = n/10;
           
        }
        int a = rev;
        int temp2=0, rev2=0;
        while(a>0){
            temp2 = a%10;
            rev2= rev2*10 + temp2;
            a = a/10;
        }
        if(rev2==num){
            return true;
        }
        return false;
    }
}