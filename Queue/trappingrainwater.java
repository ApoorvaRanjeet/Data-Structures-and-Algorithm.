public class trappingrainwater 
{
    static long trappingWater(int arr[], int n) {
        long result = 0;
        int leftMax = 0, rightMax = 0, left = 0, right = n - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    result += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    result += rightMax - arr[right];
                }
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={3,0,0,2,0,4};
        int n=arr.length;
        System.out.println(trappingWater(arr, n));;
    }
    
}
