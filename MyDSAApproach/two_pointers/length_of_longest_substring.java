import java.util.*;
public class length_of_longest_substring 
{
    public static int longest(String s)
    {
        Set<Character> set= new HashSet<>();
        int start=0,max=0;
        for(int end=0;end<s.length();end++)
        {
            char current=s.charAt(end);
            while(set.contains(current))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(current);
            max=Math.max(max,end-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abcad";
        System.out.println(longest(s));
    }
}
