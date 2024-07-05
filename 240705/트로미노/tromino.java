import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++) {
            in = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        int result = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                result = Math.max(result, count(map, i, j));
            }
        }
        System.out.println(result);
    }
    public static int count(int[][] map, int startX, int startY) {
        int[] moveX = {0, 1, 0, 1, -1, 1, -1, 0, -1, 0, 0, 0};
        int[] moveY = {-1, 0, 1, 0, 0, 0, 0, 1, 0, -1, -1, 1};
        int result = map[startX][startY];
        int tmp = 0, store = 0;
        int count = 0;

        for(int i = 0; i < moveX.length; i++) {
            int x = startX + moveX[i];
            int y = startY + moveY[i];
            if(count == 2) {
                count = 0;
                store = Math.max(store, tmp);
                tmp = 0;
            }
            count++;
            if(x < 0 || x >= map.length) {
                continue;
            }
            if(y < 0 || y >= map[0].length){
                continue;
            }
            tmp += map[x][y];
        }
        store = Math.max(store, tmp);
        return result + store;
    }
}