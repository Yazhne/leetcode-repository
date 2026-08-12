// Last updated: 8/12/2026, 10:28:55 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        int a =0;
        while(tail!=null){
            a++;
            tail=tail.next;
            
        }
        if(a==n){
            return head.next;
        }
        tail=head;
        for(int i=1;i<a-n;i++){
            tail=tail.next;
        }
        if(tail!=null && tail.next!=null){
            tail.next=tail.next.next;
        }
        return head;
    }
}
