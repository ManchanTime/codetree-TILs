import java.io.*;
import java.util.*;

public class Main {

    public static int[][] grid;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        grid = new int[n][m];
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
                    for(int x = i; x < n; x++) {
                        for(int y = j; y < m; y++) {
                            if(check(i, j, x, y)) {
                                result = Math.max(result, (x - i + 1) * (y - j + 1));
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static boolean check(int startX, int startY, int endX, int endY) {
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(grid[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}