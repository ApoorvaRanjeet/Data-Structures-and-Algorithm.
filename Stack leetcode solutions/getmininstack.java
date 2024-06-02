import java.util.Stack;
public class getmininstack 
{
    Stack<Integer> s;
    Stack<Integer> min;
    getmininstack()
{
    s=new Stack<>();
    min=new Stack<>();
}
int getMin()
{
    if(min.isEmpty())
    {
        return -1;
    }
    return min.peek();
}
int pop()
{
    if(s.isEmpty())
    {
        return -1;
    }
    int popped=s.pop();
    if(popped==min.peek())
    {
        min.pop();
    }
    return popped;
}
void push(int x)
{
    s.push(x);
    if(min.isEmpty()||x<=min.peek())
    {
        min.push(x);
    }
}
}
