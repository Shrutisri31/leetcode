class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]-(mid+1)>=k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return start+k;     
    }
}