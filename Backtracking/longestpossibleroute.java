// import java.util.ArrayList;

public class longestpossibleroute 
{
    public static int longestPath(int[][] mat, int n, int m, int xs, int ys, int xd, int yd) {
        if (mat[xs][ys] == 0 || mat[xd][yd] == 0) {
            return -1;
        }
        int[] maxLength = new int[1]; // Using an array to store the maximum length
        calc(mat, xs, ys, xd, yd, 0, maxLength);
        return maxLength[0];
    }

    private static void calc(int[][] mat, int xs, int ys, int xd, int yd, int currLen, int[] maxLength) {
        if (xs == xd && ys == yd) {
            maxLength[0] = Math.max(maxLength[0], currLen);
            return;
        }
        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};
        mat[xs][ys] = 2;
        for (int i = 0; i < 4; i++) {
            int newi = xs + di[i];
            int newj = ys + dj[i];
            if (newi >= 0 && newj >= 0 && newi < mat.length && newj < mat[0].length && mat[newi][newj] == 1) {
                calc(mat, newi, newj, xd, yd, currLen + 1, maxLength);
            }
        }
        mat[xs][ys] = 1;
    }
    public static void main(String[] args) {
        int[][] matrix = { {1,1,2,3},{1 ,0 ,1 ,0},
        {0 ,1, 1 ,0},
        {1, 1, 1, 1 }};
        int n = 3;
        int m = 4;
        int xs = 0;
        int ys = 0;
        int xd = 1;
        int yd = 7;
        int result = longestPath(matrix, n, m, xs, ys, xd, yd);
        System.out.println("Longest possible route: " + result);
    }
}
