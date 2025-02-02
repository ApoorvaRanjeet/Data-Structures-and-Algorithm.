import java.util.*;

class Job
{
    int id,deadline,profit;

    public Job(int id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
class job_sequencing
{
    public static List<Integer> job(int[]id,int[]deadline,int[]profit)
    {
        int n=id.length;
        Job[]jobs=new Job[n];
        for(int i=0;i<n;i++)
        {
            jobs[i]= new Job(id[i],deadline[i],profit[i]);
        }
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxdeadline=0;
        for(Job job:jobs)
        {
            maxdeadline= Math.max(maxdeadline,job.deadline);
        }
        int[]jobslots= new int[maxdeadline+1];
        Arrays.fill(jobslots,-1);
        int totalprofit=0,countjobs=0;
        for(Job job:jobs)
        {
            for(int j=Math.min(maxdeadline,job.deadline);j>0;j--)
            {
                if(jobslots[j]==-1)
                {
                    jobslots[j]=job.id;
                    totalprofit+=job.profit;
                    countjobs++;
                    break;
                }
            }
        }
        List<Integer> result=new ArrayList<>();
        result.add(countjobs);
        result.add(totalprofit);
        return result;
    }
    public static void main(String[]args)
    {
        int[] id = {1, 2, 3, 4, 5};
        int[] deadline = {2, 1, 2, 1, 3};
        int[] profit = {100, 50, 10, 20, 30};
        List<Integer> result= job(id,deadline,profit);
        System.out.print(result.get(0)+" "+result.get(1));
    }
}