import java.util.HashSet;
import java.util.Iterator;
public class Hashing 
{

    public static void main(String[]args)
    {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);

        // search/contains
        if(set.contains(1))
        {
            System.out.println("yes");
        }
        if(!set.contains(5))
        {
            System.out.println("no");
        }
        //delete
        set.remove(2);
        if(!set.contains(2))
        {
            System.out.println("it doesnt contain 2");
        }
        //size
        System.out.println(set.size());

        //print all elements
        System.out.println("Print All Elements: "+set);

        //Iterator
        Iterator it= set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
