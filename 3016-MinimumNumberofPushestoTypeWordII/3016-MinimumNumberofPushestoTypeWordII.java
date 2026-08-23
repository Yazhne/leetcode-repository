// Last updated: 8/23/2026, 9:08:52 PM
1class Solution {
2
3    public void reorderList(ListNode head) {
4
5        if(head == null || head.next == null){
6            return;
7        }
8
9        ListNode slow = head;
10        ListNode fast = head;
11
12        while(fast.next != null && fast.next.next != null){
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17
18        ListNode second = slow.next;
19        slow.next = null;
20
21
22        ListNode prev = null;
23
24        while(second != null){
25
26            ListNode next = second.next;
27
28            second.next = prev;
29
30            prev = second;
31            second = next;
32        }
33
34        second = prev;
35        ListNode first = head;
36
37        while(second != null){
38
39            ListNode temp1 = first.next;
40            ListNode temp2 = second.next;
41
42            first.next = second;
43            second.next = temp1;
44
45            first = temp1;
46            second = temp2;
47        }
48    }
49}