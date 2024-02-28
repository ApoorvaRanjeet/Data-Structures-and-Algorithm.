import java.util.ArrayList;
import java.util.List;
public class StringReversal 
{
    public static String reverseString(String s)
    {
        StringBuilder reversed = new StringBuilder();
        String a= s.replaceAll("\\s","");
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (reversed.indexOf(String.valueOf(c)) == -1) {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }
public static void main(String[] args) {
    // StringReversal in = new StringReversal();
    String s=  "GEEKS FOR GEEKS";
    String ans = reverseString(s);
    System.out.println(ans);
}
}
