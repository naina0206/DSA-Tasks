class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> temp;
    private Stack<Integer> minstack;
    public MinStack() {
        st=new Stack<>();
        temp=new Stack<>();
        minstack=new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        while(!minstack.isEmpty() && minstack.peek()<val){
            temp.push(minstack.pop());
        }
        minstack.push(val);
        while(!temp.isEmpty()){
            minstack.push(temp.pop());
        }
    }
    
    public void pop() {
        int element=st.pop();
        while(minstack.peek()!=element){
            temp.push(minstack.pop());
        }
        minstack.pop();
        while(!temp.isEmpty()){
            minstack.push(temp.pop());
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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