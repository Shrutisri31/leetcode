class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i: arr)
            sum=sum+i;
        if(sum%3!=0)
            return false;
        int each=sum/3,temp=0,found=0;
        for (int i=0; i<arr.length; i++) {
            temp=temp+arr[i];
            if(temp==each){
                temp = 0;
                found++;
            }
        }
        if(found>=3)
            return true;
        return false;
    }
}