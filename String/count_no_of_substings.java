import java.util.*;
public class count_no_of_substings 
{
    public long count(String s,int k)
    {
        return countDistinct(s,k)-countDistinct(s,k-1);
    }
    private long countDistinct(String s,int k)
    {
        int n=s.length();
        if(k==0)return 0;
        int left=0;
        long count=0;
        Map<Character,Integer> map= new HashMap<>();
        for(int right=0;right<n;right++)
        {
            char r=s.charAt(right);
            map.put(r,map.getOrDefault(r,0)+1);

            while(map.size()>k)
            {
                char l= s.charAt(left);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0)
                {
                    map.remove(l);
                }
                left++;
            }
            count+=right-left-1;
        }
        return count;
    }
    
}
