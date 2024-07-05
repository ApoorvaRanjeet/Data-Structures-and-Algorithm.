import java.util.*;
public class shortest_job_scheduling 
{
    public static void main(String[] args) {
        int[]bt={4,3,2,7,1};
        int n= bt.length;
        System.out.println(solve(bt,n));
    }
    public static int solve(int[] bt,int n)
    {
        Arrays.sort(bt);
        int t=0,wt=0;
        for(int i=0;i<n;i++)
        {
            wt+=t;
            t+=bt[i];
        }
        return wt/n;
        }

    
}
