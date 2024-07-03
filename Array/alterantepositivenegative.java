public class alterantepositivenegative 
{
    void rearrange(int arr[], int n) {
        int[] result = new int[n];
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int posCount = 0, negCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positives[posCount++] = arr[i];
            } else {
                negatives[negCount++] = arr[i];
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < posCount && j < negCount) {
            result[k++] = positives[i++];
            result[k++] = negatives[j++];
        }


        while (i < posCount) {
            result[k++] = positives[i++];
        }

        while (j < negCount) {
            result[k++] = negatives[j++];
        }

        for (int l = 0; l < n; l++) {
            arr[l] = result[l];
        }
    }

    public static void main(String[] args) {
        alterantepositivenegative obj = new alterantepositivenegative();
        int[] a = {9 ,4 ,-2 ,-1 ,5 ,0 ,-5 ,-3 ,2};
        int n = 9;
        obj.rearrange(a, n);
    }
}
