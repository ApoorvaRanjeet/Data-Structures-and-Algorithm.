public class moores_voting_algo
{
    public static int optimized(int[]arr)
    {
        int n=arr.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            if(count==0)
            {
                candidate=num;
            }
            if(num==candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return candidate;
        // but if the case is that theres no majority elemnt simply if the array doesnt guarantee the majoriyty element then 
        // we cant simply return the candidate coz tis would return the number which is actually not the majority element

    }
    public static void main(String[]args)
    {
        int[]arr={1,2,2,2,1,1,1};
        System.out.print(optimized(arr));
    }
}