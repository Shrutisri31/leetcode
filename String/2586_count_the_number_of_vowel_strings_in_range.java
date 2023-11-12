class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        for(int i=left;i<=right;i++){
            String s=words[i];
            char ch1=s.charAt(0);
            char ch2=s.charAt(s.length()-1);
            if(set.contains(ch1) && set.contains(ch2))
                count++;
        }
        return count;
    }
}