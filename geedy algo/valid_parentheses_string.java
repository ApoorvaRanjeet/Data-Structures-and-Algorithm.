
public class valid_parentheses_string 
{
    public boolean valid(String s)
    {
        int minopen=0;
        int maxopen=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                minopen++;
                maxopen--;
            }
            else if(c==')')
            {
                minopen=Math.max(minopen-1,0);
                maxopen--;
            }
            else if(c=='*')
            {
                minopen=Math.min(minopen-1,0);
                maxopen++;
            }
        }
        if(maxopen<0)return false;
        return minopen==0;
    }
    
}
