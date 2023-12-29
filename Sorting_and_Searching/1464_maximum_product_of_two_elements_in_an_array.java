//Approach 1 
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}

//Approach 2 
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=nums.length; i++){
            for(int j=i+1; j<=nums.length-1;j++){
              int temp =  (nums[i]-1)*(nums[j]-1);
               if(temp > max)  max = temp;  
            }
        }
        return max;
    }
}
