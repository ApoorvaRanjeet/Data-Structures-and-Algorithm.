public class Robot_return_to_orgin 
{
    public static boolean judge(String moves)
    {
        int x=0;int y=0;
        for(char c:moves.toCharArray())
        {
            switch(c)
            {
                case 'R':
                     x++;
                     break;
                case 'L':
                     x--;
                     break;
                case 'U':
                     y++;
                     break;
                case 'D':
                     y--;
                     break;
            }
        }
        return x==0 && y==0;
    }
    public static void main(String[] args) {
        System.out.println(judge("RL"));
    }
}
