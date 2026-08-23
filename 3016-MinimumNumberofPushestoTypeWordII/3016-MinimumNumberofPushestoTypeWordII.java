// Last updated: 8/23/2026, 10:56:59 PM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        if(head == null || head.next == null) {
4            return head;
5        }
6        ListNode less = new ListNode(-1);
7        ListNode more = new ListNode(-1);
8
9        ListNode tail1 = less;
10        ListNode tail2 = more;
11
12        ListNode temp = head;
13        while(temp != null) {
14            if(temp.val < x) {
15                tail1.next = temp;
16                tail1 = tail1.next;
17            }
18            else {
19                tail2.next = temp;
20                tail2 = tail2.next;
21            }
22            temp = temp.next;
23        }
24        
25        tail1.next = more.next;
26        tail2.next = null;
27        return less.next;
28    }
29}