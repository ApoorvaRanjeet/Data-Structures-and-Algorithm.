import java.util.*;
public class intersection_of_two_unsorted_arrays {
    public static List<Integer> intersection(int[]arr1,int[]arr2)
    {
        List<Integer> list= new ArrayList<>();
        if(arr1==null ||arr2==null)
        {
            return list;
        }
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int p:arr2)
        {
            if(map.containsKey(p)&& map.get(p)>0)
            {
                list.add(p);
                map.put(p,map.get(p)-1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[]arr1={1,2,2,3,4};
        int[]arr2={1,1,2,2};
        System.out.println(intersection(arr1, arr2));
    }
}
