class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i:arr){
          hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet <Integer>hs= new HashSet<>(hm.values());
        int n=hm.size();
        int m=hs.size();
        if(n==m)
         return true;
        return false;  
    }
}