import java.util.*;
public class Subarray_sum 
{
    public static int sum(int[]arr,int k)
    {
        int count=0;
        int sum=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int k=3;
        System.out.println(sum(arr,k));
    }
}
