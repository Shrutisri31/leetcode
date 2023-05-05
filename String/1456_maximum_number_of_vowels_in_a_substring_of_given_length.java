class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= k) {
                char firstChar = s.charAt(i - k);
                if (isVowel(firstChar)) {
                    count--;
                }
            }
            char currentChar = s.charAt(i);
            if (isVowel(currentChar)) {
                count++;
            }
            if (i >= k - 1) {
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}