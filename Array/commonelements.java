import java.util.ArrayList;

public class commonelements 
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int prevA = Integer.MIN_VALUE, prevB = Integer.MIN_VALUE, prevC = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                // Handle duplicates
                if (A[i] != prevA && B[j] != prevB && C[k] != prevC) {
                    result.add(A[i]);
                    prevA = A[i];
                    prevB = B[j];
                    prevC = C[k];
                }
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return result;
    }
}
