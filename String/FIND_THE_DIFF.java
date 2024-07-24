
public class FIND_THE_DIFF 
{
    public static char findthedifference(String s,String t)
    {
        if(s==null||t==null)
        {
            throw new IllegalArgumentException("input string shiuld not be null");
        }
        char ch=0;
        for(char c: s.toCharArray())
        {
            ch^=c;
        }
        for(char c:t.toCharArray())
        {
            ch^=c;
        }
        return ch;
    }
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(findthedifference(s,t));
    }
}
