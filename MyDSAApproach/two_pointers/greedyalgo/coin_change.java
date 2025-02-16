import java.util.*;
public class coin_change
{
    public static int coin(int[]coins,int amount)
    {
        
        Arrays.sort(coins,(a,b)->(b-a));
        int count=0;
        int remaining=amount;
        for(int i=0;i<coins.length && remaining>0;i++)
        {
            while(coins[i]<=remaining)
            {
                count++;
                remaining-=coins[i];
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        int[] coins={1,2,5};
        int amount=11;
        System.out.println(coins,amount);
    }
}