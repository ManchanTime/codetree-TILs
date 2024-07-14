import java.io.*;
import java.util.*;

public class Main {
    public static int result;
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
        int count = 0;
        bombs = new Point[10];

        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(in[j]);
                if (grid[i][j] == 1) {
                    bombs[count++] = new Point(i, j);
                }
            }
        }

        used = new boolean[count];
        result = 0;
        backTracking(count);
        System.out.println(result);
    }

    public static void backTracking(int index) {
        if (index == 0) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] >= 1) {
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                Point bomb = bombs[i];
                int x = bomb.x;
                int y = bomb.y;

                for (int j = 0; j < 3; j++) {
                    int[][] backup = new int[4][2];
                    for (int k = 0; k < 4; k++) {
                        int moveX = x + bombX[j][k];
                        int moveY = y + bombY[j][k];

                        if (moveX >= 0 && moveX < n && moveY >= 0 && moveY < n) {
                            grid[moveX][moveY]++;
                            backup[k][0] = moveX;
                            backup[k][1] = moveY;
                        } else {
                            backup[k][0] = -1;
                            backup[k][1] = -1;
                        }
                    }

                    grid[x][y]++;
                    backTracking(index - 1);
                    grid[x][y]--;

                    for (int k = 0; k < 4; k++) {
                        if (backup[k][0] != -1 && backup[k][1] != -1) {
                            grid[backup[k][0]][backup[k][1]]--;
                        }
                    }
                }

                used[i] = false;
            }
        }
    }

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}