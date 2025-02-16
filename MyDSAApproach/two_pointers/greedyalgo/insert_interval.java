import java.util.*;
public class insert_interval
{
    public static int[][] insert(int[][]intervals,int[]newinterval)
    {
        int n=intervals.length;
        int i=0;
        List<int[]> result= new ArrayList<>();
        while(i<n && intervals[i][1]<newinterval[0])
        {
            result.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newinterval[1])//overlapping merge wala case
        {
            newinterval[0]=Math.min(intervals[i][0],newinterval[0]);
            newinterval[1]=Math.max(intervals[i][1],newinterval[1]);
            i++;
        }
        result.add(newinterval);
        while(i<n)
        {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}