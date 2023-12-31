class Solution {
    public int uniqueMorseRepresentations(String[] words){
     String[] MORSE_CODE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> transformations = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(MORSE_CODE[c - 'a']);
            }
            transformations.add(sb.toString());
        }
        return transformations.size();

    }
}