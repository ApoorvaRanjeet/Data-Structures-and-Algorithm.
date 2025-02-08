import java.util.*;
class Activity
{
    int start,finish;
    public Activity(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }
}
public class activity_selection_problem
{
    public static int activities(int[]start,int[]finish)
    {
        int n=start.length;
        Activity[]act= new Activity[n];
        for(int i=0;i<n;i++)
        {
            act[i]=new Activity(start[i],finish[i]);
        }
        Arrays.sort(act,(a,b)->a.finish-b.finish);
        int count=1;
        int lastfinishtime=act[0].finish;
        for(int i=1;i<n;i++)
        {
            if(act[i].start>=lastfinishtime)
            {
                count++;
                lastfinishtime=act[i].finish;
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        int[]start={1,2,3,5};
        int[]finish={3,5,6,8};
        System.out.println(activities(start,finish));
    }
}