import java.util.*;
public class longest_unequal_subsequence 
{
    public static List<String> solve(String[]words,int[]groups)
    {
        List<String> result= new ArrayList<>();
        if(words.length==0)
        {
            return result;
        }
        result.add(words[0]);
        int l=groups[0];
        for(int i=1;i<words.length;i++)
        {
            if(groups[i]!=l)
            {
                result.add(words[i]);
                l=groups[i];
            }
        }
return result;
    }
    
}
