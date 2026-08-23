// Last updated: 8/23/2026, 10:52:08 PM
1class MinStack {
2    int min = Integer.MAX_VALUE;
3    Stack<Integer> stack = new Stack<Integer>();
4    public void push(int x) {
5      
6        if(x <= min){          
7            stack.push(min);
8            min=x;
9        }
10        stack.push(x);
11    }
12
13    public void pop() {
14        
15        if(stack.pop() == min) min=stack.pop();
16    }
17
18    public int top() {
19        return stack.peek();
20    }
21
22    public int getMin() {
23        return min;
24    }
25}