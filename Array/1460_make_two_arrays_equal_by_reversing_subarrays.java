class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(target[i] == arr[i]){
                count++;
            }
        }
        if(count == arr.length){
            return true;
        }
        else{
            return false;
        }
    }
}