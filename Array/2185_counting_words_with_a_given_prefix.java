class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            int len = pref.length();
            if(len<=words[i].length()){
                String s = words[i].substring(0,len);
                if(pref.equals(s)){
                    count++;
                }
            }
        }
        return count;
    }
}

