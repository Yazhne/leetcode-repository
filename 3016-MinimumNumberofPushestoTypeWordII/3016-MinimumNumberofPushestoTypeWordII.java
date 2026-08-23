// Last updated: 8/23/2026, 10:48:49 PM
1class Solution {
2    public Node copyRandomList(Node head) {
3        
4        if(head == null){
5            return head;
6        }
7
8        Node temp = head;
9        while(temp != null){
10            Node node = new Node(temp.val);
11            node.next = temp.next;
12            temp.next = node;
13            temp = temp.next.next;
14        }
15
16        temp = head;
17        while(temp != null){
18            if(temp.random != null){
19                temp.next.random = temp.random.next;
20            }
21            temp = temp.next.next;
22        }
23
24        Node copyList = head.next;
25        Node copy = copyList;
26        Node original = head;
27        while(original != null){
28            original.next = original.next.next;
29            if(copy.next != null){
30                copy.next = copy.next.next;
31            }
32            original = original.next;
33            copy = copy.next;
34        }
35
36        return copyList;
37    }
38}
39