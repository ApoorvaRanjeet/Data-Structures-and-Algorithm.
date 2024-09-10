import java.util.*;
public class closest_three_sum 
{
    public int closest(int[]arr,int n,int target)
    {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        int closestsum=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                int diff= Math.abs(target-sum);
                if(diff<mindiff)
                {
                    mindiff=diff;
                    closestsum=sum;
                }
                else if(mindiff==diff && sum>closestsum)
                {
                    closestsum=sum;
                }
                if(sum>target)
                {
                    k--;
                }
                else if(sum<target)
                {
                    j++;
                }
                else
                {
                    return sum;
                }
            }
        }
        return closestsum;
    }
    
}
