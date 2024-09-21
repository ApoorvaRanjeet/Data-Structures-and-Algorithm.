import java.util.*;
public class longest_substring_without_repeating_characters 
{
    //better approach
    public int longest(String s)
    {
        if(s.length()==0)
        {
            return 0;
        }
        int maxlen=Integer.MIN_VALUE;
        Set<Character> set= new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            if(set.contains(s.charAt(r)))
            {
                while(l<r && set.contains(s.charAt(r)))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
    // optimized approach
    public int longestSubstring(String s)
    {
        HashMap<Character,Integer> map= new HashMap<>();
        int l=0,r=0;
        int len=0;
        int n=s.length();
        while(r<n){
            if(map.containsKey(s.charAt(r)))
            {
                l=Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            len=Math.max(len,r-l+1);
            return len;
        }

    }
}
