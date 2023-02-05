class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);     
        int res=0,r1=0,r2=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i%2==0)
            {
                r1=r1+(c-'0');
            }
            else if(i%2!=0)
            {
                r2=r2-(c-'0');
            }
        }
        res=r1+r2;
        return res;
    }
}