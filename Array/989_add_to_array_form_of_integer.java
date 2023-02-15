class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=num.length-1;i>=0 || k>0;i--){
            if(i>=0){
             res.add((num[i]+k) % 10);
             k=(num[i]+k)/10;
            }
            else{
                res.add(k%10);
                k=k/10;
            }
        }
        Collections.reverse(res);
        return res;
    }
}