import java.util.*;
public class maximum_erasure_value
{
    public static int sum(int[]arr)
    {
        int left=0,right=0;
        int max=0,currentsum=0;
        Set<Integer> set= new HashSet<>();
        while(right<arr.length)
        {
            while(set.contains(arr[right]))
            {
                currentsum-=arr[left];
                set.remove(arr[left]);
                left++;
            }
            currentsum+=arr[right];
            set.add(arr[right]);
            max=Math.max(max, currentsum);
            right++;
        }
return max;
    }
    public static void main(String[]args)
    {
        int[]arr={4,2,4,5,6};
        System.out.println(sum(arr));
    }
}