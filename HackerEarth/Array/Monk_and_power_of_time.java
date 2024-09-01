import java.util.*;
public class Monk_and_power_of_time 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();
        Queue<Integer> callingorder= new LinkedList<>();
        Queue<Integer> idealorder= new LinkedList<>();
        for(int i=0;i<N;i++)
        {
            callingorder.add(in.nextInt());
        }
        for(int i=0;i<N;i++)
        {
            idealorder.add(in.nextInt());
        }
        int count=0;
        while(!idealorder.isEmpty())
        {
            int a=callingorder.peek();
            int b=idealorder.peek();
            if(a==b)
            {
                idealorder.poll();
                callingorder.poll();
            }
            else
            {
                callingorder.poll();
                callingorder.add(a);
            }
            count++;
        }
        System.out.println(count);
        in.close();
    }
    
}
