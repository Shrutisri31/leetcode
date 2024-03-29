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
class Solution {
    public int Length(ListNode head)   //for calculating length of LL
    {
    int size = 0;
    while(head != null){
        size++;
        head = head.next;   //Traverse LL
    }
    return size;
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        int size = Length(head);  //Calculate size of LL 
       //base case
       if(head == null || size < k){     //no need to reverse (if LL is empty or size of LL is less than K)
           return head;
       }
        //step 1 - reverse first K nodes  --(using 3 pointers Iterative approach)
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        //step 2 - recursive call 
        if(next != null)
        {
        head.next = reverseKGroup(next,k);
        }
        //step 3 -return head of reversed LL
        return prev;

    }
}
