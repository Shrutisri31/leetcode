class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> occur = new HashMap<>();
        int threshold = arr.length/4;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            occur.put(curr, occur.getOrDefault(curr,0) + 1);
             if(occur.get(curr) > threshold){
                 return curr;
             }    
        }
        return -1;
    }
}
