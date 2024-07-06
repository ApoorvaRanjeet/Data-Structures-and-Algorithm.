// import java.util.*;
public class reverse_a_string_using_recursion 
{
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder s= new StringBuilder(str);
        reverse(s,0,s.length()-1);
        
        System.out.println(s.toString());
     
    }
    public static void reverse(StringBuilder s, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        char temp = s.charAt(start);
        s.setCharAt(start, s.charAt(end));
        s.setCharAt(end, temp);
        reverse(s,start+1,end-1);
    }
    
}
