import java.util.Stack;
class implement_stack_using_queues {

    private Stack<Integer> obj;
    public implement_stack_using_queues () 
    {
       obj= new Stack<>();
    }
    
    public void push(int x) {
        obj.push(x);
    }
    
    public int pop() {
        return obj.pop();
    }
    
    public int top() {
        return obj.peek();
    }
    
    public boolean empty() {
        return obj.isEmpty();
    }
    public static void main(String[]args)
    {
        implement_stack_using_queues in = new implement_stack_using_queues();
        // Push elements to stack
        in.push(10);
        in.push(20);
        // Pop
        System.out.println("Poped element: "+in.pop());
        // Peek
        System.out.println("Topmost element of the stack is: " + in.top());
        // Check if stack is empty or not
        System.out.println("Is stack Empty? "+in.empty());
    }
}