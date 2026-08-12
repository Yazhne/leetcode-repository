// Last updated: 8/12/2026, 10:24:48 PM
class MyQueue {

    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
        this.inputStack = new Stack<>();
        this.outputStack = new Stack<>();
    }
    
    public void push(int x) {
        while(!this.outputStack.isEmpty()){
            this.inputStack.push(this.outputStack.pop());
        }
        this.inputStack.push(x);
        while(!this.inputStack.isEmpty()){
            this.outputStack.push(this.inputStack.pop());
        }
    }
    
    public int pop() {
        return this.outputStack.pop();
    }
    
    public int peek() {
        return this.outputStack.peek();
    }
    
    public boolean empty() {
        return this.outputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */