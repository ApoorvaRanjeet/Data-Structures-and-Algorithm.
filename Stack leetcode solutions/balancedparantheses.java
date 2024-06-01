import java.util.Stack;
public class balancedparantheses 
{
    boolean balanced(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                stack.pop();
            } 
            else
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses in = new ValidParentheses();
        String s = "())()";
        boolean ans = in.isValid(s);
        System.out.print(ans);
    }
}
