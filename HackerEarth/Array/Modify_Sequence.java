import java.util.*;
public class Modify_Sequence 
{
    public static void main(String[] args) throws Exception
    {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int[]nums= new int[N];
        for(int i=0;i<N;i++)
        {
            nums[i]=in.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<N;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flag=false;
                break;
            }
            nums[i+1]-=nums[i];
            if(nums[i+1]<0)
            {
                flag=false;
                break;
            }
        }
        if (nums[N - 1] != 0) {
            flag = false;
        }
        if(flag)
        {
            System.out.println("YES");
        }
else
{
    System.out.println("NO");
}
    }
    
}
