class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
	 for(int i=0; i<s.length(); i++){
         char curr = s.charAt(i);
         if(isOpening(curr)){
             stack.push(curr);
         }
         else{
             if(stack.isEmpty()){
                 return false;
             }
             else if(!isMatching(stack.peek(),curr)){
                return false;
             }
             else{
                 stack.pop();
             }
         }
     }
     return stack.isEmpty();
    }

    boolean isOpening(char c){
       return c == '(' || c == '{' || c == '[';
    }

    boolean isMatching(char a, char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b ==  ']');
    }
}