public class firstuniquechar
{
    public int first(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            int sum=0;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j&& s.charAt(i)==s.charAt(j))
                {
                    sum++;
                    break;
                }
            }
            if(sum==0)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstuniquechar f = new firstuniquechar();
        int ans=f.first("apoorva");
        System.out.println(ans);
    }
}