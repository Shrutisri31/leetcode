class Solution {
    public int fib(int n) {
      public class Solution {

    int fib(int n) {
        if( n <= 0){
            return 0;
        }
        else if( n == 1){
            return 1;
        }
        int a=0, b=1;
        int c = a+b;
        for(int i=2; i<n; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
}
}