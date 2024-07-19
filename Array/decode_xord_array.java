import java.util.ArrayList;

public class decode_xord_array 
{
    public static int[] decode(int[] encoded, int first) {
        int xor = first;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(first);
        for (int i = 0; i < encoded.length; i++) {
            xor = encoded[i] ^ xor;
            arr.add(xor);
        }
        int[] intArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            intArray[i] = arr.get(i);
        }
        return intArray;
    }
    public static void main(String[] args) {
        int[]encoded={1,2,3};
        int first=1;
        int ans[]= decode(encoded,first);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
