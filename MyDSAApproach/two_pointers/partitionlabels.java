import java.util.*;
public class partitionlabels 
{
    public static List<Integer> partition(String s)
    {
        List<Integer> result= new ArrayList<>();
        int[]length= new int[26];
        for(int i=0;i<s.length();i++)
        {
            length[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(length[s.charAt(i)-'a'],end);

            if(i==end)
            {
                result.add(end-start+1);
                start=i+1;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
        System.out.println(partition(s));
    }
}
