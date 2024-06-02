import java.util.Stack;
public class deletemiddleelementofstack 
{
    public void deleteMid(Stack<Integer>s, int sizeOfStack)
    {
        delete(s, (sizeOfStack)/2+1);
    }
    private void delete(Stack<Integer>s,int k)
    {
        if(k==1)
        {
            s.pop();
            return;
        }
        int temp=s.pop();
        deleteMid(s, k-1);
        s.push(temp);
    }
    public static void main(String[] args) 
    {
        deletemiddleelementofstack in = new deletemiddleelementofstack();
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Original Stack: " + s);
        in.deleteMid(s, s.size());
        System.out.println("Stack after deleting middle element: " + s);
    }
}
