class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digit=0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
         for (int i : nums) {
            int n=i, rem=0;
       
            while(n>0)
            {
                rem=n%10;
                digit=digit+rem;
                n=n/10;
            }
        }
        return Math.abs(sum-digit);
    }
}