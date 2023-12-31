import java.util.List;

public class reversearraylist 
{
    public static List<Integer> reverseArray(List<Integer> a) 
    {
        int n = a.size();
        for (int i = 0; i < n / 2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(n - i - 1));
            a.set(n - i - 1, temp);
        }
        return a;
    }
    public static void main(String[]args)
    {
        List<Integer> originalList = List.of(1, 2, 3, 4, 5);
        System.out.println("Original List: " + originalList);

        List<Integer> reversedList = reverseArray(originalList);
        System.out.println("Reversed List: " + reversedList);
    }
    
}
