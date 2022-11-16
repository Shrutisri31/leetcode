class Solution {
    public int subtractProductAndSum(int n) {
       int temp , digit;
       int product = 1;
        int sum = 0;
       temp = n;
        while(temp!=0){
              digit =  temp % 10;
              product = product * digit;
              sum = sum + digit;
              temp = temp/10; 
        }
         
        int res = product - sum;
        return res;
    }
}
