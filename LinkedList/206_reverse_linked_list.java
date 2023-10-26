class Solution {
    public ListNode reverseList(ListNode head) {
        //check if LL is empty or single node 
        if(head == null || head.next == null)
        {
            return head;
        }
        //recursive approach
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}