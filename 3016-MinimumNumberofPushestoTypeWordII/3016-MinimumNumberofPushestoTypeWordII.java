// Last updated: 8/23/2026, 8:47:16 PM
1public class Solution {
2    public ListNode swapPairs(ListNode head) {
3        if ((head == null)||(head.next == null))
4            return head;
5        ListNode n = head.next;
6        head.next = swapPairs(head.next.next);
7        n.next = head;
8        return n;
9    }
10}