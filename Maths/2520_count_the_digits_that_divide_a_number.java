class Solution {
    public int countDigits(int num) {
        int val=0,n=num;
        int count=0;
        while(n>0){
            val = n % 10;
            if(num % val == 0){
                count++;
            }
            n=n/10;
        }
       return count;
    }
}