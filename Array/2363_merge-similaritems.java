class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
         
        int[] map = new int[1000];
     
        for (int[] item : items1) {
            map[item[0]-1] = item[1];
        }
      
        for (int[] item : items2) {
            map[item[0]-1] = map[item[0]-1] + item[1];
        }
        
        List<List<Integer>> res = new ArrayList<>(items1.length + items2.length);
		
        for (int i = 0; i < map.length; i++) {
            if (map[i] > 0) {
                res.add(List.of(i+1, map[i]));
            }
        }
        return res;
    }
}