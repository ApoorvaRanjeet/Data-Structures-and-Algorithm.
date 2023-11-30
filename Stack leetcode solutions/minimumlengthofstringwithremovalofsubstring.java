import java.util.Stack;
public class minimumlengthofstringwithremovalofsubstring 
{
    public int minlength(String s)
    {
        Stack<Character> leftSymbols = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!leftSymbols.isEmpty()&& ch=='B'&&leftSymbols.peek()=='A'||ch=='D'&&ch=='C')
            {
                leftSymbols.pop();
            }
            else
            {
                leftSymbols.push(ch);
            }
        }
        return leftSymbols.size();
    }
    public static void main(String[] args) {
        minimumlengthofstringwithremovalofsubstring mlsrs=new minimumlengthofstringwithremovalofsubstring();
        System.out.println("minimum length of string with removal of substring is "+mlsrs.minlength("ABACAD"));
    }
}
