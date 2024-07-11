
import java.util.*;
public class reverse_words_in_a_string {
    public static String reverse(String s)
    {
        s=s.trim();
        String[] words= s.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(reverse(s));
    }
}
