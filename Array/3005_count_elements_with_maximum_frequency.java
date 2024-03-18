class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Calculate the frequency of each element in nums
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxFrequency = 0;
        
        for (int frequency : map.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }
        
        // Count the elements with maximum frequency
        int count = 0;
        for (int frequency : map.values()) {
            if (frequency == maxFrequency) {
                count++;
            }
        }
        
        return count*maxFrequency;


    }
}