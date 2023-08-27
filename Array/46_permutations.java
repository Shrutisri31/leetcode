class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }
    private static void backtrack(int[] nums, List<Integer> currPm, List<List<Integer>> res)
     {
        if (currPm.size() == nums.length) {
            res.add(new ArrayList<>(currPm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (currPm.contains(nums[i])) {
                continue; // Skip if the element is already in the current permutation
            }

            currPm.add(nums[i]);
            backtrack(nums, currPm, res);
            currPm.remove(currPm.size() - 1);
        }
    }
}