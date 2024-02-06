import java.util.ArrayList;
import java.util.List;

public class leftrotation 
{
    public static List<Integer> rotateleft(int d, List<Integer> arr) {
        int n = arr.size();
        if(d<=0||d%n==0)
        {
            return arr; // no rotation needed 
        }
        d=d%n;
        List<Integer> rotated= new ArrayList<Integer>(arr.subList(d, n));
        rotated.addAll(arr.subList(0, d));
        return rotated;
}
public static void main(String[] args) 
{

    List<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5));
    int d=2;
    List<Integer> rotated=rotateleft(d,arr);
    System.out.println(rotated);
    
}
}