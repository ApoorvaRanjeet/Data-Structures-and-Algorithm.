import java.util.*;
public class Isomorphic_String {
    public static  boolean strings(String s, String t)
    {
        Map<Character,Character> mapS= new HashMap<>();
        Map<Character,Character> mapT= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char chs= s.charAt(i);
            char cht=t.charAt(i);
            if(mapS.containsKey(chs))
            {
                if(mapS.get(chs)!=cht)
                {
                    return false;
                }
            }
            else{
                mapS.put(chs,cht);
            }
            if(mapT.containsKey(cht))
            {
                if(mapT.get(cht)!=chs)
                {
                    return false;
                }
            }
            else{
                mapT.put(cht,chs);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "egg";
        String t="add";
        System.out.println(strings(s,t));
    }
}
