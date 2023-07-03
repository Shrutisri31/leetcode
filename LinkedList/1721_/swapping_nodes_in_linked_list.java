
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Approach 1 -- brute force (find kth node from beginning and Kth node from end & then swapping values of both nodes
class Solution {
    public static int Length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int len = Length(head);
       if(head == null || head.next == null){
           return head;
       }
     
       //Kth node from beginning 
       ListNode kBeg =  null;
       ListNode temp = head;
        for(int i=1 ; i<k ; i++){
           temp = temp.next;
        }
        kBeg = temp;
       //kth node from end
      ListNode kEnd= null;
       ListNode temp1 = head;
       for(int i=1; i< len-k+1 ; i++){
           temp1 = temp1.next;
       }
       kEnd = temp1;

       //swap values 
       int next = kBeg.val;
       kBeg.val  = kEnd.val;
       kEnd.val = next;
       return head;  
    }
}

//Approach 2 -- (2 pointers )

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode fast = head;
       ListNode slow = head;
       while(k>1){
            fast = fast.next;
            --k;   
       } 
       ListNode kBeg = fast;
       while(fast.next != null){
           slow = slow.next;
           fast = fast.next;
       }
       ListNode kEnd = slow;
       //swap values 
       int temp = kBeg.val;
       kBeg.val = kEnd.val;
       kEnd.val = temp;
       return head;
    }
}
