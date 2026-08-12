// Last updated: 8/12/2026, 10:25:15 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode nnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nnext;
        }

        return prev;
    }
}