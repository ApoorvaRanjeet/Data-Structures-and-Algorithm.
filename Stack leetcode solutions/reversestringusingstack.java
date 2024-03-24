import java.util.Stack;
public class reversestringusingstack 
{
    public String reverse(String S)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            stack.push(ch);
        }
        String str="";
        for(int i=0;i<S.length();i++)
        {
            str=str+stack.pop();
        }
        return str;
    }
    public static void main(String[] args) 
    {
        reversestringusingstack in = new reversestringusingstack();
       String s=in.reverse("geeksforgeeks");
       System.out.println(s);
    }
}
