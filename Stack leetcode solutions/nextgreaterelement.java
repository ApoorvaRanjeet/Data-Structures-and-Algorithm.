import java.util.Stack;
public class nextgreaterelement 
{
    public static long[] nextLargerElement(long[] arr, int n) 
    {
        Stack<Integer> stack = new Stack<>();
        long[] result = new long[n];
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() &&arr[stack.peek()]<arr[i])
            {
                result[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            result[stack.pop()]=-1;
        }
        return result;
    }
    public static void main(String[] args) {
        // nextgreaterelement in = new nextgreaterelement();
        long[]arr={3,10,4,2,1,2,6,1,7,2,9};
        int n=11;
        long[] result = nextLargerElement(arr, n);
        
        // Printing the result
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
