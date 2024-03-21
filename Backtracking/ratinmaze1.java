import java.util.ArrayList;

public class ratinmaze1 
{
    public static ArrayList<String> findPath(int[][] m, int n) {
     

        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 1) {
            allpaths("", m, 0, 0, ans);
        }
        return ans;
    }

    static void allpaths(String p, int[][] maze, int r, int c, ArrayList<String> ans) {
        if (r == maze.length - 1 && c == maze[0].length - 1) { // base condition
            ans.add(p);
            return;
        }
        if (maze[r][c] == 0) { // condition for restricted block
            return;
        }
        // I am considering this block in my path
        maze[r][c] = 0;
        if (r < maze.length - 1) {
            allpaths(p + 'D', maze, r + 1, c, ans);
        }
        if (c < maze[0].length - 1) {
            allpaths(p + 'R', maze, r, c + 1, ans);
        }
        if (r > 0) {
            allpaths(p + 'U', maze, r - 1, c, ans);
        }
        if (c > 0) {
            allpaths(p + 'L', maze, r, c - 1, ans);
        }
        // revert changes made by the function
        maze[r][c] = 1;
    }
    
    }

