import java.util.*;
public class MajorityElementII 
{
    public List<Integer> bruteforce(int[]nums)
    {
        List<Integer> result= new ArrayList<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            cnt=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
            if(cnt>nums.length/3)
            {
                result.add(nums[i]); 
            }
        }
        return result;
    }
    public List<Integer> better(int[]nums)
    {
        List<Integer> result= new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>n/3)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    public List<Integer> optimal(int[]nums)
    {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int n = nums.length;
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: Verify if the candidates appear more than n/3 times
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
}
