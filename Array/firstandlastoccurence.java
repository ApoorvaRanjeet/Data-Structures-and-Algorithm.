import java.util.ArrayList;

public class firstandlastoccurence 
{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int firstIndex = first(arr, 0, n - 1, x, n);
        int lastIndex = last(arr, 0, n - 1, x, n);
        if(firstIndex==-1)
        {
            result.add(firstIndex);
            return result;
        }
        else
        {
            result.add(firstIndex);
        result.add(lastIndex);
        return result;
        }

        
    }

    public static int first(int arr[], int low, int high, int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, mid + 1, high, x, n);
            else
                return first(arr, low, mid - 1, x, n);
        }
        return -1;
    }

    public static int last(int arr[], int low, int high, int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, mid - 1, x, n);
            else
                return last(arr, mid + 1, high, x, n);
        }
        return -1;
    }
    
}
