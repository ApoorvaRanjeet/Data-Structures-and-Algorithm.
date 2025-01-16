import java.util.*;
public class targeted_sum_unsorted_array 
{
    public static List<List<Integer>> sum(int[]arr,int target)
    {
        Map<Integer,Integer> map= new HashMap<>();
        List<List<Integer>> list= new ArrayList<>();
        for(int i:arr)
        {
            int current=target-i;
            if(map.containsKey(current))
            {
                list.add(Arrays.asList(current,i));
            }
            map.put(i,1);
        }
        return list;
    }
    public static void main(String[] args) 
    {
        int[]arr={4, 7, 1, -3, 2, 5};
        int target=9;
        List<List<Integer>> ans= sum(arr,target);
        System.out.println(ans);
    }
    
}
