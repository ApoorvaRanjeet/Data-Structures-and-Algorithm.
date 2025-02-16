import java.util.*;
class Job
{
    int start,end;
    int process;
    public Job(int start,int end, int process)
    {
        this.start=start;
        this.end=end;
        this.process=process;
    }
}
public class shortest_job_scheduling
{
    // start = [1, 2, 3]
    // end = [3, 5, 6]
    // process = [2, 2, 1]
    public static int jobscheduling(int[]start,int[]end,int[] process)
    {
        int n=start.length;
        Job[]jobs= new Job[n];
        for(int i=0;i<n;i++)
        {
            jobs[i]= new Job(start[i],end[i],process[i]);
        }
        Arrays.sort(jobs,(a,b)->(a.end-b.end));
        int lasttime=-1;
        int totalcount=0;
        for(int i=0;i<n;i++)
        {
            if(jobs[i].start>=lasttime)
            {
                totalcount+=jobs[i].process;
                lasttime=jobs[i].end;
            }
        }
        return totalcount;
    }
    public static void main(String[] args) {
        int[] start = {1, 2, 3};
        int[] end = {3, 5, 6};
        int[] process = {2, 2, 1};

        System.out.println(jobscheduling(start, end, process)); // Expected Output: 3
    }
}