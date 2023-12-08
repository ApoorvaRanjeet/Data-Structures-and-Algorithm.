import javax.print.DocFlavor.STRING;
import java.util.Stack;

public class reducedstring {
    public static String superReducedString(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray())
        {
            if(!stack.isEmpty()&& stack.peek()==ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        if(stack.isEmpty())
        {
            return "Empty String";
        }
        else
        {
            StringBuilder str= new StringBuilder();
            while(!stack.isEmpty())
            {
                str.append(stack.peek());
                stack.pop();
            }
            str.reverse(); 
            return str.toString();
        }
        
}

    public static void main(String[] args) {
        // reducedstring in = new reducedstring();
        String s = "oagciicgaoyjmahhamjymmwjnnjwmmvpxhpphxpvlikappakilyygvkkvgyymlpfddfplmhiodvvdoihfxpkggkpxfuevvuuvveu";
        String ans = superReducedString(s);
        System.out.println(ans);
    }
}
