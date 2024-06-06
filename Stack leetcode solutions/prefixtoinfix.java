import java.util.Stack;
public class prefixtoinfix 
{
    public static String prefix(String s)
    {
        Stack<String> stack= new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                stack.push(Character.toString(c));
            }
            else
            {
                String operand1=stack.pop();
                String operand2=stack.pop();
                String infixexpression="("+operand1+c+operand2+")";
                stack.push(infixexpression);
            }
         
        }
        return stack.pop();
    }
    public static void main(String[] args) 
    {
        String prefixExp1 = "*-A/BC-/AKL";
        System.out.println(prefix(prefixExp1)); // Output: ((A-(B/C))*((A/K)-L))

        String prefixExp2 = "+A*BC";
        System.out.println(prefix(prefixExp2));
    }
}
