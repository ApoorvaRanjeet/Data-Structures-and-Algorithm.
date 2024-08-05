import java.util.*;
public class Apple_redistribution 
{
    public static int count(int[]apple,int[] capacity)
    {
        int sum=0;
        int asum=0;
        int count=0;
        for(int i=0;i<apple.length;i++)
        {
            asum+=apple[i];
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--)
        {
            sum+=capacity[i];
            count++;
            if(sum>asum)
            {
                return count;
            }
        }
        return count;
    }
    
}
