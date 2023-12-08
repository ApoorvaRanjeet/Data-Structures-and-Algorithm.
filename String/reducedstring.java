import javax.print.DocFlavor.STRING;

public class reducedstring 
//baab
{
    public  String superReducedString(String s) 
    {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i+1<s.length() && s.charAt(i+1)==ch)
            {
                i++;
            }
            else
            {
                str.append(ch);
            } 
        }
        String sr = str.toString();
        StringBuilder n = new StringBuilder();
        for(int i=0;i<sr.length();i++)
        {
            char ch=sr.charAt(i);
            if(i+1<sr.length() && sr.charAt(i+1)==ch)
            {
                i++;
            }
            else
            {
                n.append(ch);
            }
        }
        if(n.length()==0)
        {
            return "empty string";
        }
        return n.toString();
    }
    public static void main(String[]args)
    {
        reducedstring in = new reducedstring();
        String s="baab";
        System.out.println(in.superReducedString(s));
    }
}
