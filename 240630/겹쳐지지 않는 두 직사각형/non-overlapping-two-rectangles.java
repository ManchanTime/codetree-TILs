import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int result = Integer.MIN_VALUE;
        int[][] grid = new int[N][M];
        for(int i = 0; i < N; i++) {
            in = br.readLine().split(" ");
            for(int j = 0 ; j < M; j++){
                grid[i][j] = Integer.parseInt(in[j]);
            }
        }

        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < M - 1; j++) {
                for(int k = i; k < N - 1; k++) {
                    for(int t = j; t < M - 1; t++) {
                        int tmp = calc(grid, i, j, k, t);
                        tmp += Math.max(calc(grid, k + 1, t, N - 1, M - 1), calc(grid, k, t + 1, N - 1, M - 1));
                        result = Math.max(result, tmp);
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static int calc(int[][] grid, int startX, int startY, int endX, int endY) {
        int result = Integer.MIN_VALUE;
        int count = 0;
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                count += grid[i][j];
                result = Math.max(result, count);
            }
        }
        return result;
    }

    public static class SquareInfo {
        int startX;
        int endX;
        int startY;
        int endY;
        int value;

        public SquareInfo(int startX, int endX, int startY, int endY, int value) {
            this.startX = startX;
            this.endX = endX;
            this.startY = startY;
            this.endY = endY;
            this.value = value;
        }
    }
}