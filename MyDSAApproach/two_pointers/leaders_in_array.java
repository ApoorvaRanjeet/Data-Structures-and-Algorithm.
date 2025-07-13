import java.util.*;
public class leaders_in_array
{
    public static List<Integer> leaders(int[]arr)
    {
        int n=arr.length;
        int leader=arr[n-1];
        List<Integer>list=new ArrayList<>();
        list.add(leader); // coz last element is always leader
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>leader)
            {
                leader=arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);  // shortcut to reverse list
        return list;
    }
    public static void main(String[]args)
    {
        int[]arr={16,17,3,4,5,2};
        System.out.print(leaders(arr));
    }
}