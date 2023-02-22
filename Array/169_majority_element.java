class Solution {
    public int majorityElement(int[] nums) {
         int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                max = nums[i];
            }
            count += (nums[i] == max)?1:-1;
        }
        return max;
    }
}