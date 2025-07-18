import java.util.*;
public class next_greater_element_I
{
    public static int[] nextgreater(int[]arr)
    {
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            int num=arr[i];
            while(!stack.isEmpty() && stack.peek()<num)
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                arr[i]=stack.peek();
            }
            else
            {
                arr[i]=-1;
            }
            stack.push(num);
        }
        return arr;
    }
    public static void main(String[]args)
    {
        int[]arr={6,8,0,1,3};
        System.out.print(Arrays.toString(nextgreater(arr)));
    }
}