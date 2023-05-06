Approach 1 

class Solution {
    public int numSubseq(int[] nums, int target) {
         final int MOD = 1000000007;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        long count = 0;
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                count += pow(2, j - i, MOD);
                i++;
            } else {
                j--;
            }
        }
        return (int)(count % MOD);
    }

     private long pow(long a, int b, int MOD) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }
}

Approach 2 (optimized)

class Solution {
    public int numSubseq(int[] nums, int target) {
       var n = nums.length;
       Arrays.sort(nums);

       var exp = new int[n];
       exp[0] = 1;

    for (var i=1; i<n; i++){
      exp[i] = (exp[i-1] * 2) % 1000000007;
    }
    int i = 0, j = n-1, count = 0;

    while (i <= j) {
      if (nums[i] + nums[j] <= target) {
        count = (count + exp[j-i]) % 1000000007;
        i++;
      } else {
        j--;
      }
    }
    return count;
    }
}
