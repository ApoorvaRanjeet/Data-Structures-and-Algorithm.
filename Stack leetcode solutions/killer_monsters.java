
import java.util.Stack;
public class killer_monsters 
{
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int n= arr.length;
        int[] result=solve(arr,n);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] solve(int[] arr, int N) {
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
            result[i] = stack.size();
        }
        
        return result;
    }
    
}
