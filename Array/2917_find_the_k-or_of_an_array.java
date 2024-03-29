class Solution {
    public int findKOr(int[] nums, int k) {
      int ans=0;
        int arr[]= new int[32];    // set bit count array
        for(int i=0;i<nums.length;i++){
         
            int num=nums[i];
            int ind=0;     // to track the index of the bits in the current element
            while(num!=0){    
                int dig=num%2;
                num=num/2;
                if(dig==1){    //checking for set bits
                    arr[ind]++;     //increase count for the index
                }
                ind++;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=k){
                ans+=(int)Math.pow(2,i);
            }
        }
        return ans;   
    }
}