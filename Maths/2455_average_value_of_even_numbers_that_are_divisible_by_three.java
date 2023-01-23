class Solution {
    public int averageValue(int[] nums) {
         ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums){
            if(num%2 == 0 && num%3 == 0) list.add(num);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if(list.size()>0) return sum/list.size();
        else return 0;
    }
}
