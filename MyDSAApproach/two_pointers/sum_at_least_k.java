import java.util.*;
public class sum_at_least_k
{
    public static List<Integer> sum(int[]arr,int k,int target)
    {
        int left=0;
        int right=arr.length-1;
        while(right-left>=k)
        {
            if(Math.abs(arr[left]-target)>Math.abs(arr[right]-target))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        List<Integer> result= new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5};
        int k=4;
        int target=3;
        System.out.println(sum(arr,k,target));
    }
}