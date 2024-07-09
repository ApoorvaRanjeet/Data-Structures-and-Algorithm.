import java.util.*;
public class two_sum_better_sol 
{
    public static int[] sum(int[]nums,int target)
    {
        Map<Integer,Integer> map= new HashMap<>();
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int t= target-nums[i];
            if(map.containsKey(t))
            {
                ans[0]=map.get(t);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums= {2, 6, 5, 8, 11};
        int target = 16;
        int[] ans= sum(nums,target);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
    
}
