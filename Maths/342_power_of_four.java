class Solution {
    public boolean isPowerOfFour(int n) {
        //1st Approach
        if(n==0)
            return false;
        while(n!=1)
        {
            if(n%4!=0)
                return false;
            n=n/4;
        }
        return true; 
        // //2nd Approach
        // if (n != 0 && n == (int)Math.pow(4, (Math.log(n) / Math.log(4)))) 
        // {
        //     return true;
        // }
        // return false;
    }
}
