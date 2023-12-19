import java.util.*;
public class Hashmap 
{
    public static void main(String[]args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        //Insertion
        map.put(120,"India");
        map.put(130,"china");
        System.out.println(map);

        //search
        if(map.containsKey(120))
          System.out.println("yes");

        //if we want ot access the value along with the key
        System.out.println(map.get(120));
        System.out.println(map.get(140));


        // // method 1 : from entry set
        // for(Map.Entry<Integer,String> e:map.entrySet())
        // {
        //   System.out.println(e.getKey());
        //   System.out.println(e.getValue());
        // }
        // // method 2 from key set
        // Set <Integer> keys=map.keySet();
        // for(Integer key : keys)
        // {
        //        System.out.println(key+" "+map.get(key));
        // }
        // to remove any key value pair

        map.remove(120);
    }
    
}
