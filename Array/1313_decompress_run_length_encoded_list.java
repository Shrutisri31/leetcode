class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <(n >>> 1); i++) {
            int a = nums[2 * i];
            int b = nums[2 * i + 1];

            for (int j = 0; j < a; j++) {
                list.add(b);
            }
        }

        int ans[] = new int[list.size()];
        for (int i = 0; i <ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
