import java.util.*;
public class Roman_to_Integer 
{
    public int romanToInt(String s)
    {
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i<s.length()-1 && map.get(c)<map.get(s.charAt(i+1)))
            {
                count-=map.get(c);
            }
            else 
            {
                count+=map.get(c);
            }
        }
        return count;
    }
    
}
