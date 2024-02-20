public class countsquares 
{
    static int countSquares(int N) 
    {
        // int sum=0;
        // for(int i=1;i<N;i++)
        // {
        //     double a= i*i;
        //     if(a<N)
        //     {
        //         sum++;
        //     }
        // }
        // return sum;
        int sum=0;
        for(int i=0;i*i<N;i++)
        {
            sum++;
        }
        return sum;
    }  //this code needs to be optimized 


    public static void main(String[] args) 
    {
        int N=15;
        int ans= countSquares(N);
        System.out.println(ans);
    }
}
