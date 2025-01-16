import java.util.*;
public class target_sum_all_pairs 
{
    public static List<List<Integer>> sum(int[]arr,int target)
    {
        List<List<Integer>> ans= new ArrayList<>();
        if(arr.length==0||arr.length<2)
        {
            return ans;
        }
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==target)
            {
                ans.add(Arrays.asList(arr[l],arr[r]));
                l++;
                r--;
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
        return ans;
    }
    public static void main(String[] args) 
    {
        int[]arr={0,1,2,3,4,5};
        int target=5;
        List<List<Integer>> ans= sum(arr,target);
        System.out.println(ans);
        
    }
}
