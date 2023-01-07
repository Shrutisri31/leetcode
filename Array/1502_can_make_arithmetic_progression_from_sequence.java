class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
      if(arr.length<3){
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        for(int i = 2; i < arr.length; i++){
            if(arr[i-1] - arr[i] != diff){
                return false;
            }
        }
        return true;   
    }
}