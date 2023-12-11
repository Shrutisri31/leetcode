class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
              return IntStream.range(0, words.length).filter(index -> words[index].indexOf(x) >= 0).boxed().toList();
  
    }
}