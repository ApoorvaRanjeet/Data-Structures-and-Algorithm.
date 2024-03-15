public class mazewithobstacles 
{
    static void pathrestrictions(String p,boolean[][] b,int r,int c)
    {
        if(r==b.length-1 && c==b[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!b[r][c])
        {
            return;
        }
        if(r<b.length-1)
        {
            pathrestrictions(p+'D', b, r+1, c);
        }
        if(c<b[0].length-1)
        {
            pathrestrictions(p+'R', b, r, c+1);
        }

    }
    public static void main(String[] args) {
        boolean[][] maze={
            {true, true,true},
            {true, false,true},
            {true, true,true}
        };
        pathrestrictions("", maze, 0, 0);
    }
}
