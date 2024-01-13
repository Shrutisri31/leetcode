class Solution {
    public boolean hasTrailingZeros(int[] nums) {
       int ct = 0;
	for(int i=0; i<nums.length; i++){
		if((nums[i]&1) == 0){
			ct++;
		}
	}

	return ct>=2;  
    }
}