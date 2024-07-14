import java.io.*;
import java.util.*;

public class Main {

    public static int result;
    public static int count;
    public static int n;
    public static int[][] bombX;
    public static int[][] bombY;
    public static int[][] grid;
    public static Point[] bombs;
    public static boolean[] used;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bombX = new int[3][4];
        bombY = new int[3][4];
        bombX[0] = new int[]{-1, -2, 1, 2};
        bombY[0] = new int[]{0, 0, 0, 0};
        bombX[1] = new int[]{0, 0, -1, 1};
        bombY[1] = new int[]{-1, 1, 0, 0};
        bombX[2] = new int[]{-1, 1, 1, -1};
        bombY[2] = new int[]{-1, -1, 1, 1};
        grid = new int[n][n];
        count = 0;
        bombs = new Point[10];
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(in[j]);
                if(grid[i][j] == 1) {
                    bombs[count] = new Point(i, j);
                    count++;
                }
            }
        }
        used = new boolean[count];
        backTracking(count);
        System.out.println(result);
    }

    public static void backTracking(int index) {
        if(index == 0) {
            int count = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(grid[i][j] >= 1) {
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
            return;
        }
        for(int i = 0; i < count; i++) {
            if(!used[i]) {
                used[i] = true;
                int x = bombs[i].x;
                int y = bombs[i].y;
                for(int j = 0; j < 3; j++) {
                    int moveX, moveY;
                    Point[] backup = new Point[4];
                    for(int k = 0; k < 4; k++) {
                        moveX = x + bombX[j][k];
                        moveY = y + bombY[j][k];
                        if(moveX >= n)
                            moveX = n - 1;
                        if(moveX < 0)
                            moveX = 0;
                        if(moveY >= n)
                            moveY = n - 1;
                        if(moveY < 0)
                            moveY = 0;
                        grid[moveX][moveY]++;
                        backup[k] = new Point(moveX, moveY);
                    }
                    backTracking(index - 1);
                    for(int k = 0; k < 4; k++) {
                        grid[backup[k].x][backup[k].y]--;
                    }
                    grid[x][y]++;
                }
                used[i] = false;
            }
        }
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}