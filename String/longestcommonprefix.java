import java.util.*;
public class longestcommonprefix 
{
    public String longest(String[] s)
    {
        int size=s.length;
        if(size==0)
        {
            return " ";
        }
        if(size==1)
        {
            return s[0];
        }
        Arrays.sort(s);
        int end = Math.min(s[0].length(),s[size-1].length());
        int i=0;
        while(i<end && s[0].charAt(i)==s[size-1].charAt(i+1))
        {
           i++;
        }
        String str = s[0].substring(0,i);
        return str;
    }
    public static void main(String[] args) {
        longestcommonprefix lcp = new longestcommonprefix();
        String[]s={"flow","flower","flirt"};
        String ans = lcp.longest(s);
        System.out.println(ans);
    }
    
}
