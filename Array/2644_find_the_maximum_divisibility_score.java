class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
             int a=0;
        int aa=Integer.MAX_VALUE;
        for(int i=divisors.length-1;i>=0;i--){
            int d=divisors[i];
             int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%d==0)
                c++;
            }
            if(c==a){
                aa=Math.min(aa,d);

            }
            if(c>a){
                a=c;
                aa=d;

            }
        }
        return aa;
   
    }
}