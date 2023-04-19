class Solution {
    public int reverse(int x) {
       int temp=0;
        int n=x;
        while(n!=0)
        {
             int digit=n % 10;
            if((temp>Integer.MAX_VALUE/10) || (temp<Integer.MIN_VALUE/10))
            {
                return 0;
            }
            temp= (temp * 10) + digit;
            n=n/10;

        }
         return temp; 
    }
}