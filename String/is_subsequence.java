import java.util.*;
import java.util.Queue;
public class is_subsequence {
    public static boolean isSubsequence(String s, String t) {

        Queue<Character> queue= new LinkedList<Character>();
        for(char c:s.toCharArray())
        {
            queue.add(c);
        }
        int right=0;
        while(!queue.isEmpty()&& right<t.length())
        {
            if(queue.peek()==t.charAt(right))
            {
                queue.remove();
            }
            right++;
        }
        return queue.isEmpty()?true:false;
    }
    public static void main(String[] args) {
        String s="abc";
        String t="ahbdec";
        System.out.println(isSubsequence(s, t));
    }
}
