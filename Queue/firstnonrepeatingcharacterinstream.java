import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
public class firstnonrepeatingcharacterinstream 
{
    public String firstnon(String a)
    {
        StringBuilder result = new StringBuilder();
        HashMap<Character,Integer> countMap= new HashMap<>();
        Queue<Character> queue= new LinkedList<>();
        for(char ch:a.toCharArray())
        {
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            if(countMap.get(ch)==1)
            {
                queue.add(ch);
            }
            while(!queue.isEmpty() &&countMap.get(queue.peek())>1)
            {
                queue.poll();
            }
            if(queue.isEmpty())
            {
                result.append('#');
            }
            else
            {
                result.append(queue.peek());
            }
        }
        return result.toString();
    }
    
}
