class Solution {
    public void sortColors(int[] nums) {
        int res[] = new int[3];
        for (int i: nums) 
        {
            res[i]++;
        }
        for (int i = 0; i < nums.length; i++) 
        {
            if (i < res[0]) 
            {
                nums[i] = 0;
            } 
            else if (i < res[0] + res[1])
            {
                nums[i] = 1;
            } 
            else 
            {
                nums[i] = 2;
            }
        }
    }
}