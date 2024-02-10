public class alterantepositivenegative 
{
    void rearrange(int[] a, int n) {
        int[] arr = new int[n];
        int pIndex = 0;
        int nIndex = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                arr[pIndex] = a[i];
                pIndex += 2;
            } else {
                arr[nIndex] = a[i];
                nIndex += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        alterantepositivenegative obj = new alterantepositivenegative();
        int[] a = {9 ,4 ,-2 ,-1 ,5 ,0 ,-5 ,-3 ,2};
        int n = 9;
        obj.rearrange(a, n);
    }
}
