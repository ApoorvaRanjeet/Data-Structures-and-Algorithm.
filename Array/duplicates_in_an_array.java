import java.util.*;
public class duplicates_in_an_array 
{
    public static boolean containsDuplicate(int[] nums) 
    {
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer>entry:map.entrySet())
       {
        int val= entry.getValue();
        if(val>=2)
        {
            return true;
        }
       }
       return false;
        
    }
    // efficient solution we can use hashset
    public static boolean containsDuplicate1(int[] nums)
    {
        Set<Integer> set= new HashSet<>();
        for(int num:nums)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        boolean ans=containsDuplicate(num);
        System.out.println(ans);
        boolean ans1= containsDuplicate1(num);
        System.out.println(ans1);
    }
    
}
