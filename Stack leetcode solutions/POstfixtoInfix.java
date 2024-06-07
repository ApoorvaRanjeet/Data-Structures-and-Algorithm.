import java.util.Stack;
public class POstfixtoInfix 
{
    static String postToInfix(String exp) 
    {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char c= exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                stack.push(Character.toString(c));
            }
            else
            {
                String op1=stack.pop();
                String op2=stack.pop();
                String infixexpression="("+op2+c+op1+")";
                
                stack.push(infixexpression);
            }
        }
        return stack.pop();
      
    }
    public static void main(String[] args) {
        String postfix = "ab*c+";
        String infix = postToInfix(postfix);
        System.out.println("Infix expression: " + infix); // Output: ((a*b)+c)
    }
}
