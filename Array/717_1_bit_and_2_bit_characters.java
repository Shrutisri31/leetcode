class Solution {
    public boolean isOneBitCharacter(int[] bits){
        // boolean dig=false;
        // int count=0;
        // for(int i=0;i<bits.length;i++){
        //    count++;
        // }
        // if(count%2==0){
        //    return dig;
        // }
        // else if(bits[bits.length-1]==0){
        //     dig=true;
        // }
        // return dig;
        for(int i=0; i<bits.length; i++) {
            if(i==bits.length-1) {
                return true;
            }
            if(bits[i]==1) {
                i++;
            }   
        }
        return false;
    }
}