import java.util.*;
public class Longest_subarray_with_sum_equal_K 
{
    public int lenOfSub(int[]nums,int k,int n)
    {
        int length=0;
        int sum=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                length=Math.max(length,i-map.get(sum-k));
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return length;
    }
    
}
