import java.util.Stack;
public class camelcase 
{
    public static int number(String s)
    {
        int len = s.length();
        char[]ch = s.toCharArray();
        int count=0;
        int space=1;
        for(int i=0;i<len;i++)
        {
            // if(i==0)
            // {
            //     ch[i]=Character.toLowerCase(ch[i]);
            // }
            
                if(i>0 && ch[i]==Character.toUpperCase(ch[i]))
            {
                space++;
            }
            // else
            // {
            //     ch[count++]=ch[i];
            // }
            
            
        }
        return space;
    }
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        int ans = number(s);
        System.out.println(ans);
    }
    
}
