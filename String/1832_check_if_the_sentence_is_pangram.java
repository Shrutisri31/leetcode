class Solution {
    public boolean checkIfPangram(String sentence) {
        char c[]=sentence.toCharArray();
        Arrays.sort(c);
        String s=new String(c);
        String a="abcdefghijklmnopqrstuvwxyz";
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k==26){
                break;
            }
           if(s.charAt(i)==a.charAt(k)){
            k++;
          }
        }
        if(k==26)
        return true;
        else
        return false;
    }
}