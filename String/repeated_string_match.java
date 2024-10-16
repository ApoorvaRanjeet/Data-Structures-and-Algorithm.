public class repeated_string_match 
{
    public int match(String a,String b)
    {
        StringBuilder repeated= new StringBuilder();
        int count=0;

        while(repeated.length()<b.length())
        {
            repeated.append(a);
            count++;
        }
        if(repeated.toString().contains(b))
        {
            return count;
        }
        repeated.append(a);
        count++;
        if(repeated.toString().contains(b))
        {
            return count;
        }
        return -1;
    }
    
}
