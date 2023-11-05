class Solution {
    public List<String> fizzBuzz(int n) {
       ArrayList<String> ans= new ArrayList<>();
        for(int num=1;num<=n;num++)
        {
            boolean divisibleby3=(num%3==0);
            boolean divisibleby5=(num%5==0);
            if(divisibleby3 && divisibleby5)   ans.add("FizzBuzz");    
            else if(divisibleby3) ans.add("Fizz");  
            else if(divisibleby5) ans.add("Buzz");
            else{
                ans.add(Integer.toString(num));
            }
        }
        return ans; 
    }
}