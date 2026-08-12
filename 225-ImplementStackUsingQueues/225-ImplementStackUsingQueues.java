// Last updated: 8/12/2026, 10:25:02 PM
class MyStack {
    private Queue<Integer> q;
    public MyStack() {
        q= new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        q.add(q.poll());
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}