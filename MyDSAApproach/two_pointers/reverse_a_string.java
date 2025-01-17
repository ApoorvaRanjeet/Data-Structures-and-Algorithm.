public class reverse_a_string 
{
    public static String reverse(String a)
    {
        // edge case
        if(a==null)
        {
            return null;
        }
        char[] ch=a.toCharArray();
        int l=0;
        int r=a.length()-1;
        while(l<r)
        {
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        String s=new String(ch);
        return s;
    }
    public static void main(String[] args) {
        String a="APOORVA";
        System.out.println(reverse(a));
    }
}
