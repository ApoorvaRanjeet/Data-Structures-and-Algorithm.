import java.util.*;

public class next_greater_element_circular_array
{
    public static int[] circular(int[]arr)
    {
        int n=arr.length;
        Stack<Integer>stack=new Stack<>();
        int[]result=new int[n];
        for(int i=2*n-1;i>=0;i--)
        {
            int num=arr[i%n];
            while(!stack.isEmpty() && stack.peek()<=num)
            {
                stack.pop();
            }
            if(i<n)
            {
                result[i]=stack.isEmpty()? -1:stack.peek();
            }
            stack.push(num);
        }
        return result;
    }
    public static void main(String[]args)
    {
        int[]arr={1,4,3,1,3};
        System.out.print(Arrays.toString(circular(arr)));
    }
}