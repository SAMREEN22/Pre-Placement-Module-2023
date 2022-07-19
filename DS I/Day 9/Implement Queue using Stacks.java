class MyQueue {   
    Stack<Integer> in, out;
    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();      
    }  
    public void push(int x) {
        in.push(x);      
    }
    private void transfer(Stack<Integer> in, Stack<Integer> out){
        while(!in.isEmpty()){
            out.push(in.pop());
        }
    }   
    public int pop() {
        if(out.isEmpty())
            transfer(in, out);
        return out.pop();        
    }    
    public int peek() {
        if(out.isEmpty())
            transfer(in, out);
        return out.peek();        
    }    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
