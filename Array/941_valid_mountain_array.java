class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2) return false;
        if(arr[0]>=arr[1]) return false;
        int i=1;
        while(i<arr.length)
        {
            if(arr[i-1]>=arr[i++]) break;
        }
        i--;
        while(i<arr.length){
            if(arr[i-1]<=arr[i++]) return false;
        }
        return true;
    }
}