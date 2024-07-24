import java.util.*;
public class longest_sequence_without_repeating_characters 
{
    public static int length(String s)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch))
            {
                left=Math.max(map.get(ch)+1,left);
            }
            map.put(ch,right);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(length(s));
    }
}
