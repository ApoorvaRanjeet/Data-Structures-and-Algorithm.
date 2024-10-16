public class count_N_say 
{
    public String countNsay(int n)
    {
        String result= "1";
        for(int i=1;i<n;i++)
        {
            result=getNextSequence(result);
        }
        return result;
    }
    private String getNextSequence(String s)
    {
        StringBuilder st= new StringBuilder();
        int count=1;

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                st.append(count).append(s.charAt(s.charAt(i-1)));
                count=1;
            }
        }
        st.append(count).append(s.charAt(s.length()-1));
        return st.toString();
    }
    
}
