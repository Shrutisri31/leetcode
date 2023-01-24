class Solution {
    public int pivotIndex(int[] nums) {
        int sumL=0,sumR=0 , totalsum=0;
       
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0 ; i<nums.length ; i++){
            sumR=totalsum-sumL;
            if((sumR-nums[i])==sumL)
            {   
                return i;
            }
            sumL+=nums[i];
           }
        
        return -1;
    }
}



