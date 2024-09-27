import java.util.*;
public class binary_subarrays_with_sum 
{
    public int sum(int[]nums,int goal)
    {
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int count=0,prefixsum=0;
        for(int num:nums)
        {
            prefixsum+=num;
            if(map.containsKey(prefixsum-goal))
            {
                count+=map.get(prefixsum-goal);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    
}
