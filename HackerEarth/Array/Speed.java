import java.util.*;
public class Speed 
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        for(int i=0;i<T;i++)
        {
            int N= in.nextInt();
            int[]speeds=new int[N];
            for(int j=0;j<N;j++)
            {
                speeds[j]=in.nextInt();
            }
            int count=1;
            int maxSpeed=speeds[0];
            for(int k=1;k<N;k++)
            {
                if(maxSpeed>=speeds[i])
                {
                    count++;
                    maxSpeed=speeds[i];
                }
            }
            System.out.println(count);
        }
        in.close();
    }
    
}
