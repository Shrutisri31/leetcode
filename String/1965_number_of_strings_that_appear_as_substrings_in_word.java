class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String i:patterns){
            if(word.startsWith(i) || word.endsWith(i)){
                count++;
            }
            else if(word.contains(i)){
                count++;
            }
        }
        return count;
    }
}