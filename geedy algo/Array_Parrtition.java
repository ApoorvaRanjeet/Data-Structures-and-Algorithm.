import java.util.*;
public class Array_Parrtition 
{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(partition(arr));

    }
    public static int partition(int[]nums)
    {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum+=nums[i];
        }
        return sum;
    }
}
