class Solution {
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for (int i=0; i<=s.length(); i++){
            String x = s.substring(0, i);
            for (int j = 0; j<words.length; j++) {
                if (x.equals(words[j]))
                    result++;
            }
        }
        return result;
    }
}