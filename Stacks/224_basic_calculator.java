class Solution {
    public int calculate(String s) {
        StringBuilder pf = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int sum =0;
        int sign = 1;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
               int val=0;
               while( i < s.length() && Character.isDigit(s.charAt(i)))
               {
                  val = val * 10 + (s.charAt(i) - '0');
                  i++;
               }
                 i--;
                val = val * sign;
                sign = 1;
                sum = sum + val;
            }
            else if( ch == '(' || ch == '{' || ch == '['){
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = +1;

            }
            else if( ch == ')' || ch == '}' || ch == ']'){
                sum = sum * stack.pop();
                sum = sum + stack.pop();
            }
            else if ( ch == '-'){
                sign = sign * -1;
            }
        }
        return sum;
    }
}