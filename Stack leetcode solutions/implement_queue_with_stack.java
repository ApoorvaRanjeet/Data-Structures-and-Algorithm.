import java.util.LinkedList;
import java.util.Queue;


public class implement_queue_with_stack 
{
    private Queue<Integer> in;
    public implement_queue_with_stack() {
        in = new LinkedList<>();
    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        return in.poll();
    }

    public int peek() {
        return in.peek();
    }

    public boolean empty() {
        return in.isEmpty();
    }
    public static void main(String[]args)
    {
        implement_queue_with_stack in = new implement_queue_with_stack();
        in.push(10);
        in.push(12);
        System.out.println("Peek: " +in.peek()); //prints 10
        System.out.println("Pop" + in.pop());
        System.out.println("is empty" + in.empty());
    }
    
}
