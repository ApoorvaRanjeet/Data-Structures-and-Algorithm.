import java.util.*;
public class min_index_sum_of_two_lists 
{
    public static String[] findRestaurant(String[]list1,String[]list2)
    {
        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        List<String> result= new ArrayList<>();
        int max=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                int index=map.get(list2[i])+i;
                if(index<max)
                {
                    max=index;
                    result.clear();
                    result.add(list2[i]);
                }
                else if(index==max)
                {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
    public static void main(String[] args) {
        String[]list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[]list3=findRestaurant(list1, list2);
        for(int i=0;i<list3.length;i++)
        {
            System.out.println(list3[i]+" ");
        }
    }
}
