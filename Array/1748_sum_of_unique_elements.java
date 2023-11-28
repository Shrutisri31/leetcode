class Solution {
    public int sumOfUnique(int[] nums) {
        int n =nums.length;
        int ans = 0;

        int count[] = new int[100];

        for(int i=0; i<n; i++){
            count[nums[i]-1]++;
        }

        for(int i=0; i<100; i++){
            if(count[i]==1) ans = ans+i+1;
        }
        return ans;
    }
}