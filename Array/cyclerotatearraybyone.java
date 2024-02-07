import java.util.ArrayList;
import java.util.List;
public class cyclerotatearraybyone 
{
    // [1 2 3 4 5] [5 1 2 3 4]
    // static List<Integer> cycle(List<Integer> a,int n)
    // {
    //     int d = n-1;
    //     d=d%n;
    //     List<Integer> rotated= new ArrayList<Integer>(a.subList(d, n));
    //     rotated.addAll(a.subList(0, d));
    //     return rotated;
    // }
    // public static void main(String[] args) {
    //     List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
    //     int d=5;
    //     List<Integer> rotated= cycle(arr,d);
    //     System.out.println(rotated);
    
    // } 

    public void cycle(int[]a ,int n)
    {
        List<Integer> rotated = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            rotated.add(a[i]);
        }
        int d=n-1;
        d=d%n;
        List<Integer> result = new ArrayList<Integer>(rotated.subList(d,n));
        System.out.println(result);
        int[]arr = new int[n];
        result.addAll(rotated.subList(0,d));
        for (int i = 0; i < result.size(); i++)
        {arr[i] = result.get(i);}
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
            
    }

    public static void main(String[] args) 
    {
        cyclerotatearraybyone in= new cyclerotatearraybyone();
        int[]arr={1,2,3,4,5};
        int d=5;
        in.cycle(arr,d);
    }
}
