public class rotate_string 
{
    public boolean rotate(String s,String goal)
    {
        if(s.length()!=goal.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            String result= s.substring(s.length()-i)+s.substring(0,s.length()-i);
            if(result.equals(goal))
            {
                return true;
            }
        }
        return false;
    }
    //optimized approach
    public boolean optimized(String s,String goal)
    {
        return (s+s).contains(goal);
    }
}
