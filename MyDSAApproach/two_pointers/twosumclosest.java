import java.util.*;
public class twosumclosest
{
    public static int[] twosum(int[]arr,int target)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int left=0;
        int right=n-1;
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            int diff=Math.abs(target-sum);
            if(min>diff)
            {
                min=diff;
                i=arr[left];
                j=arr[right];
            }
            if(sum<target)
            {
                left++;
            }
            if(sum>target)
            {
                right--;
            }
            if(sum==target)
            {
                break;
            }
        }
        return new int[]{i,j};
    }
    public static void main(String[]args)
    {
        int[]arr={1,3,3,4};
        System.out.print(Arrays.toString(twosum(arr,6)));
    }
}