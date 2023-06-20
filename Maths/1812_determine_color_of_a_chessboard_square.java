class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0)-'a'+1;
        int n = coordinates.charAt(1)-'0';
        if((a+n)%2==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}