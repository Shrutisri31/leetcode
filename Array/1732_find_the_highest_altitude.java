class Solution {
    public int largestAltitude(int[] gain) {
     int output = 0;
        int counter = 0;
        for (int current: gain){
            counter +=current;
            output = Math.max(counter,output);
        }
        return output;   
    }
}