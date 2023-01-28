class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]= new int[nums.length];
        int odd = 1 , even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[even]=nums[i];
                even=even+2;
            }else{
                res[odd]=nums[i];
                odd=odd+2;
           }
        }
        return res;
    }
}
