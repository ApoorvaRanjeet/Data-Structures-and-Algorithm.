import java.util.*;
public class twosum_printunique_pairs
{
    public static void twosum(int[]arr,int target)
    {
        int n=arr.length;
        Set<Integer>seen=new HashSet<>(); // keep track of numbers wehave already visited
        Set<String> pairs=new HashSet<>();//keeps track of pairs 
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=target-arr[i];
            if(seen.contains(sum))
            {
                int a=Math.min(arr[i],sum);
                int b=Math.max(arr[i],sum);
                String pair=a+","+b;
                if(!pairs.contains(pair))
                {
                    count++;
                    System.out.println("("+pair+")");
                    pairs.add(pair);
                }
            }
            seen.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        twosum(arr, target);
    }
}