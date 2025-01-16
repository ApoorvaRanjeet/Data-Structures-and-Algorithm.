import java.util.*;
import java.util.List;
public class targeted_sum
{
    public static List<Integer> sum(int[]arr,int target)
    {
        int l=0;
        int r=arr.length-1;
        int sum=0;
        List<Integer>ans=new ArrayList<>();
        while(l<r)
        {
            sum=arr[l]+arr[r];
            if(sum<target)
            {
                l++;
            }
            else if(sum>target)
            {
                r--;
            }
            else
            {
                ans.add(arr[l]);
                ans.add(arr[r]);
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[]args)
    {
        int[]arr={2,5,7,9};
        int target=11;
        List<Integer> ans=new ArrayList<>();
        ans=sum(arr,target);
        System.out.println(ans);
    }
}