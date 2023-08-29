class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int idx = 0;
        while (candies > 0) {
            arr[idx++ % num_people] += Math.min(idx, candies);
            candies = Math.max(candies - idx, 0);
        }
        return arr;
    }
}