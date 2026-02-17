class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;

    public MinStack() {
        s=new Stack<>();
        m=new Stack<>();
    }
    
    public void push(int val) {
        if(!m.empty() && val<=m.peek()){
            m.push(val);

        }
        else if(m.empty()){
            m.push(val);
        }
        s.push(val);

    }
    
    public void pop() {
        if(!m.empty()){
            if(m.peek().equals(s.peek())){
                m.pop();
            }

        }
        if(!s.empty()) s.pop();

    }
    
    public int top() {
        if(!s.empty()){
            int x=s.peek();
            return x;

        } 
        return -1;
    }
    
    public int getMin() {
        if(!m.empty()){
            return m.peek();
        }
        else{
            return s.peek();
        }
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