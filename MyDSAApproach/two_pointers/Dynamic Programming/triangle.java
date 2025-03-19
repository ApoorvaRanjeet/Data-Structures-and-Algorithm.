import java.util.*;
public class triangle
{
    public static int sum(List<List<Integer>> tri)
    {
        int n=tri.size();
        int[]dp=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=tri.get(n-1).get(i);
        }
        for(int row=n-2;row>=0;row--)
        {
            for(int col=0;col<tri.get(row).size();col++)
            {
                dp[col]=tri.get(row).get(col)+Math.min(dp[col],dp[col+1]);
            }
        }
        return dp[0];
    }
    public static void main(String[]args)
    {
        List<List<Integer>> tri = Arrays.asList(
        Arrays.asList(2),
        Arrays.asList(3, 4),
        Arrays.asList(6, 5, 7),
        Arrays.asList(4, 1, 8, 3)
    );
        System.out.print(sum(tri));
    }
}