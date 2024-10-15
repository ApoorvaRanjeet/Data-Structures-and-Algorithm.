public class min_add_to_make_parantheses_valid 
{
    public int valid(String s)
    {
        int open=0;
        int close=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                open++;
            }
            else if(c==')')
            {
                if(open>0)
                {
                    open--;
                }
                else
                {
                    close--;
                }
            }
        }
        return close+open;
    }
    
}
