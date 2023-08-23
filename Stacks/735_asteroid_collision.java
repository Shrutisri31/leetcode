class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> s = new Stack<Integer>();
        for (int asteroid : asteroids)
        {            
            while(!s.isEmpty() && asteroid<0 && s.peek()>0 && s.peek()<Math.abs(asteroid))
                s.pop();  
            if (s.isEmpty() || asteroid > 0 || s.peek() < 0) 
                s.push(asteroid);
            else if (s.peek() == Math.abs(asteroid))
                s.pop();
        }
        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}