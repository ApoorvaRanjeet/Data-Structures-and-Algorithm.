public class Stack_main 
{
    public static void main(String[]args)
    {
        Stack in = new Stack(4);
        
        in.push(7);
        in.push(23);
        in.push(11);
        in.push(3);
        in.getTop();
        in.getheight();
        in.pop();
        in.printStack();
    }
    
}
