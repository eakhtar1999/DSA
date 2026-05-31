class MinStack {
    Stack<int[]> ms;

    public MinStack() {
        ms= new Stack<int[]>();
    }
    
    public void push(int val) {
        int currentMin = ms.isEmpty() ? val : ms.peek()[1];
        ms.push(new int[]{val,Math.min(val, currentMin)});
    }
    
    public void pop() {
        ms.pop();
    }
    
    public int top() {
        return ms.peek()[0];
    }
    
    public int getMin() {
        return ms.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */