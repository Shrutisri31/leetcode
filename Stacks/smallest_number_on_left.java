//Approach 1 (Using Stack - use space and TC,SC - O(n))
//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<a.length; i++){
            while(!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
        }
        if(s.isEmpty()){
            res.add(-1);
        }
        else{
            res.add(s.peek());
        }
        s.push(a[i]);
    }
      return res;
    }
}

//Approach 2 (Brute force approach - O(N*N))


//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        //traverse each element in array
        for(int i=0; i<a.length; i++){
            int prev = -1;
            //traverse left side elements of current element
            for(int j=i-1; j>=0; j--){
                if(a[j]<a[i]){
                    prev = a[j];
                    break;
                }
            }
            res.add(prev);
        }
        return res;
    }
}