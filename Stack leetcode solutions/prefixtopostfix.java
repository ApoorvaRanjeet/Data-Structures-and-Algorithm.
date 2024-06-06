import java.util.Stack;
public class prefixtopostfix 
{
    public static String postfix(String s)
    {
        Stack<String> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                stack.push(Character.toString(c));
            }
            else
            {
                String op1=stack.pop();
                String op2=stack.pop();
                String prefixtopostfix=op1+op2+c;
                stack.push(prefixtopostfix);
            }
        }
        return stack.pop();
    }
    
}
