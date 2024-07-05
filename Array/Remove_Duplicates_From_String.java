import java.util.*;
public class Remove_Duplicates_From_String 
{
    public static void main(String[] args) 
    {
        String str = "HaPpyNewYear";
       
        System.out.print(removeDuplicates(str));
    }
    public static String removeDuplicates(String str) {
        int n = str.length();
        Set<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(str.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        
        return result.toString();
    }
    
}
