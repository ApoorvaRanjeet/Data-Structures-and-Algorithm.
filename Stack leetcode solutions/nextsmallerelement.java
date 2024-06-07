import java.util.Stack;
public class nextsmallerelement 
{
    public static int[] nextSmaller(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
           
            while (!stack.isEmpty() && stack.peek() >= arr[i % n]) {
                stack.pop();
            }
            
            if (i < n) {
                if (!stack.isEmpty()) {
                    result[i] = stack.peek();
                } else {
                    result[i] = -1;
                }
            }
           
            stack.push(arr[i % n]);
        }
        return result;
    }

    public static void main(String[] args) {
        nextsmallerelement in = new nextsmallerelement();
        int[]arr={3,10,4,2,1,2,6,1,7,2,9};
        int n=11;
        int[] result = in.nextSmaller(arr, n);
        
        // Printing the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
