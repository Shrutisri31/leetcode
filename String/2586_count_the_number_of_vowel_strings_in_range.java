class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int count=0;
        for(int i=left;i<=right;i++){
            String s=words[i];
            char ch1=s.charAt(0);
            char ch2=s.charAt(s.length()-1);
            if(hs.contains(ch1) && hs.contains(ch2))
                count++;
        }
        return count;
    }
}