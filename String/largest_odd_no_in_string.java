public class largest_odd_no_in_string 
{
    public String largest(String s)
    {
       
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='1'||c=='3'||c=='5'||c=='7'||c=='9')
            {
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    
}
