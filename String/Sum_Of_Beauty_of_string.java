import java.util.*;
public class Sum_Of_Beauty_of_string 
{
    public int beautySum(String s) 
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer> map= new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                char c=s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int freq:map.values())
                {
                    max=Math.max(freq,max);
                    if(freq>0)
                    {
                        min=Math.min(freq,min);
                    }
                }
                count+=max-min;
            }
        }
        return count;
    }
    
}
