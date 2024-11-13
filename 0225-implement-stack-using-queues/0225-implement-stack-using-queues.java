class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int peek;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        peek=x;
        q1.offer(x);
    }
    public int pop() {
        while(q1.size()!=1){
            peek=q1.poll();
            q2.offer(peek);
        }
        int ele=q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return ele;
    }
    
    public int top() {
        return peek;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */