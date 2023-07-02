//Approach 1 (uses 2 iterations and Time Complexity: O(n) and no extra space 

class Solution {
    public ListNode middleNode(ListNode head) {
       int size = 0;
       ListNode temp = head;
       //traverse LL
       while(temp != null){
           size++;
           temp = temp.next;
       }
       int half = size/2;
       temp = head;
       //traverse LL Half the Length of LL times 
       while(half > 0){
           half--;
           temp = temp.next;
       }
       //at the end of taversal temp will be at the middle of LL
       return temp;

    }
}
//Approach 2 (uses single iteration and 2 pointers approach)
class Solution {
    public ListNode middleNode(ListNode head) {
     ListNode fast = head;
     ListNode slow = head;
     //traverse LL fast - 2 jump, slow - 1 jump
     while( fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next;
     }
     return slow;  //points middle of LL 
    }
}