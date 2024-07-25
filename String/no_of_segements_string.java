public class no_of_segements_string 
{
    public static int segemnts(String s)
    {
        if(s==null||s.length()==0)
        {
            return 0;
        }
        s=s.trim();
        if(s.isEmpty())
        {
            return 0;
        }
        String[] words= s.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String s="Hello, my name is John";
        System.out.println(segemnts(s));
    }
}
