class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ans1=Integer.MIN_VALUE , ans2 = Integer.MIN_VALUE;
        int count1 = 0 , count2 = 0;
        for(int e: nums){
            if(e == ans1) {
                count1++;
            }
            else if( e == ans2){
                count2++;
            }
            else if (count1 == 0){
                ans1 = e;
                count1=1;
            }
            else if(count2 == 0){
                ans2 = e;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
            //checking if ans1 and ans2 is actually the answer 
            count1 = 0 ; count2 = 0;
            for(int e:nums){
                if(e == ans1){
                    count1++;
                }
                else if(e == ans2){
                    count2++;
                }
            }
            ArrayList<Integer> res = new ArrayList<>();

            if(count1 > nums.length/3){
                res.add(ans1);
            }
           if(count2 > nums.length/3){
                res.add(ans2);
           }
        return res;
    }
}