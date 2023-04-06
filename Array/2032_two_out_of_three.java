class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
      List<Integer> l=new ArrayList<>();
        Set<Integer> l1=new HashSet<>();
        Set<Integer> l2=new HashSet<>();
        
        for(int i:nums1)
            l1.add(i);
        
        
        for(int i:nums2)
        {
            if(l1.contains(i)&&!l.contains(i))l.add(i);
            l2.add(i);
        }
        
        for(int i:nums3)
        {
            if((l1.contains(i)||l2.contains(i))&&!l.contains(i))l.add(i);
        }
        return l;   
    }
}