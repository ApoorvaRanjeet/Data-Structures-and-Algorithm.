public class allpathsmaze {
    static void allpaths(String p, boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 &&c==maze[0].length-1)   //base condition
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])   // condition for restricted block
        {
            return;
        }
        //I am considering this block in my path
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            allpaths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            allpaths(p+'R',maze,r,c+1);
        }
        if(r>0)
        {
            allpaths(p+'U', maze, r-1, c);
        }
        if(c>0)
        {
            allpaths(p+'L', maze, r, c-1);
        }
        //this line is where function will be over
        //so before the function gets removed, also remove the changes made by the function
        maze[r][c]=true;
    }
    public static void main(String[] args) {
        boolean[][] maze={
            {true, true,true},
            {true, true,true},
            {true, true,true}
        };
        allpaths("", maze, 0, 0);
    }
}
