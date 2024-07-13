import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int[][] grid = new int[n][m];
        int result = -1;
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            for(int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(in[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] > 0) {
                    result = Math.max(result, getSize(grid, i, j, n - 1, m - 1));
                }
            }
        }
        System.out.println(result);
    }

    public static int getSize(int[][] grid, int startX, int startY, int endX, int endY) {
        int result = 1;
        boolean flag = false;
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(grid[i][j] < 0) {
                    if (i > 0) {
                        result = Math.max(result, getSize(grid, startX, startY, i - 1, endY));
                    }
                    result = Math.max(result, getSize(grid, startX, startY, endX, j - 1));
                    flag = true;
                }
            }
        }
        if(!flag) {
            result = (endX - startX + 1) * (endY - startY + 1);
        }
        //System.out.println(startX + " " + startY + " " + endX + " " + endY + " " + result);
        return result;
    }
}