import java.util.*;
public class defenders_of_numeria
{
    public static int leader(int[]arr)
    {
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        int k=n/2;
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>k)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int[] nextGreater(int[]arr)
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
        int[]arr={2,1,2,4,3,2,2};
        System.out.println("Leader "+leader(arr));
        System.out.print("nextGreater "+Arrays.toString(nextGreater(arr)));

    }
}