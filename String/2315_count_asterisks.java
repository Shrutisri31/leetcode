class Solution {
    public int countAsterisks(String s) {
        int count=0, ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|')
                count++;
            if(s.charAt(i)=='*' && count%2==0)
                ans++;
        }
        return ans;
    }
}
