import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int[][] map = new int[n][n];
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            for(int j = 0 ; j < n; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n - 1; k++) {
                    int cost = k * k + (k + 1) * (k + 1);
                    int cnt = count(map, k, i, j);
                    if(cost < cnt * m) {
                        result = Math.max(result, cnt);
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static int count(int[][] map, int K, int startX, int startY) {
        int x1, x2;
        int y;
        int result = 0;
        for(int i = 0; i <= K; i++) {
            y = startY + i;
            x1 = startX + K - i;
            x2 = startX - K + i;
            if(y < 0 || y >= map[0].length) {
                continue;
            }
            for(int j = startX; j <= x1; j++) {
                int x = j;
                if(x < 0 || x >= map.length) {
                    continue;
                }
                if(map[x][y] == 1) {
                    result++;
                }
            }
            for(int j = x2; j < startX; j++) {
                int x = j;
                if(x < 0 || x >= map.length) {
                    continue;
                }
                if(map[x][y] == 1) {
                    result++;
                }
            }
        }
        for(int i = -1; i >= -K; i--) {
            y = startY + i;
            x1 = startX + K + i;
            x2 = startX - K - i;
            if(y < 0 || y >= map[0].length) {
                continue;
            }
            for(int j = startX; j <= x1; j++) {
                int x = j;
                if(x < 0 || x >= map.length) {
                    continue;
                }
                if(map[x][y] == 1) {
                    result++;
                }
            }
            for(int j = x2; j < startX; j++) {
                int x = j;
                if(x < 0 || x >= map.length) {
                    continue;
                }
                if(map[x][y] == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}