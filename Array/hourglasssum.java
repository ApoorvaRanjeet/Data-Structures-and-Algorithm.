import java.util.*;

public class hourglasssum 
{
    public static int sum(int[][] arr) {
        int n = arr.length;
        int[] a = new int[(n - 2) * (n - 2)];

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        sum = sum + arr[i + k][j + l];
                    }
                }
                // Adjust the index calculation for 'a'
                a[i * (n - 2) + j] = sum - arr[i + 1][j] - arr[i + 1][j + 2];
            }
        }

        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > temp) {
                temp = a[i];
            }
        }

        return temp;
    }
    public static void main(String[]args)
    {
        Scanner in= new Scanner(System.in);
        int rows=in.nextInt();
        int cols=in.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=in.nextInt();
            }
        }
        System.out.println("The maximum hour glass sum is "+sum(numbers));
    }
}
