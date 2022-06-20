class Solution {
    public int[] runningSum(int[] nums) {
        int a[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i>0)
            {
                a[i]= nums[i]+a[i-1];
            }
            else
            {
                a[i]=nums[i];
            }
        }
        return a;
    }
}