class Solution {
    private static void backtrack(List<String> result, Map<Character, String> digitToLetters, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }  
        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);
        
        for (int i = 0; i < letters.length(); i++)
         {
            char letter = letters.charAt(i);
            backtrack(result, digitToLetters, digits, current + letter, index + 1);
         }
    }
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>();
          if (digits == null || digits.length() == 0)
           {
            return result;
           }
        
        HashMap<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        
        backtrack(result, digitToLetters, digits, "", 0);
        return result;
    }
}
