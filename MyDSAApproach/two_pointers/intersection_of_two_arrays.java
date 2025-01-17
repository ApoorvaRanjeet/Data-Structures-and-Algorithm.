import java.util.*;
public class intersection_of_two_arrays {
    public static List<Integer> intersection(int[]arr1,int[]arr2)
    {
        List<Integer> result= new ArrayList<>();
        if(arr1==null||arr2==null)
        {
            return result;
        }
        int p1=0;
        int p2=0;
        while(p1<arr1.length && p2<arr2.length)
        {
            if(arr1[p1]==arr2[p2])
            {
                result.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1]<arr2[p2])
            {
                p1++;
            }
            else
            {
                p2++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr1={1,2,2};
        int[]arr2={1,1,2,2,3,4};
        System.out.println(intersection(arr1,arr2));
    }
}
