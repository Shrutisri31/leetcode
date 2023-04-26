<<<<<<< HEAD
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() != 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            maxHeap.offer(Math.abs(stone1 - stone2));
        }
        return maxHeap.poll();
    }
=======
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() != 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            maxHeap.offer(Math.abs(stone1 - stone2));
        }
        return maxHeap.poll();
    }
>>>>>>> 7e3185e69e1dfbe196f8f756c75c77fcea74e37f
}