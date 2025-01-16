import java.util.*;
public class targeted_sum_refined_varsion 
{
    public static List<Integer> sum(int[]arr,int target)
    {
        // edge case
        if(arr.length==0||arr.length<2)
        {
            return null;
        }
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
            {
                return Arrays.asList(arr[l],arr[r]);
            }
            else if(sum<target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[]arr={2,5,7,9};
        int target=11;
        List<Integer> ans=new ArrayList<>();
        ans=sum(arr,target);
        System.out.println(ans);
    }
    
}
