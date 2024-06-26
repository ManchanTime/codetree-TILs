import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        int result = 0;
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        for(int i = 0; i < N - 2; i++) {
            for(int j = 0; j < N - 2; j++) {
                result = Math.max(result, count(map, new NodeInfo(i, j)));
            }
        }
        System.out.println(result);
    }

    public static int count(int[][] map, NodeInfo start) {
        int result = 0;
        for(int i = start.x; i < start.x + 3; i++) {
            for(int j = start.y; j <start.y + 3; j++) {
                if(map[i][j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    public static class NodeInfo {
        int x;
        int y;

        public NodeInfo(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}