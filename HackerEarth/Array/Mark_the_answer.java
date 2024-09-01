import java.util.*;
public class Mark_the_answer 
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int X=in.nextInt();
        int maxscore=0;
        int skip=0;
        for(int i=0;i<N;i++)
        {
            int value=in.nextInt();
            if(value<=X)
            {
                maxscore++;
            }
            else
            {
                skip++;
                if(skip>1)
                {
                    break;
                }
            }
        }
        System.out.println(maxscore);
        in.close();
    }
    
}
