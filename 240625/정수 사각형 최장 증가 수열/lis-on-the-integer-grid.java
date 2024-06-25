import java.io.*;
import java.util.*;

public class Main {

    public static int[][] store;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        int result = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                store = new int[N][N];
                bfs(map, new NodeInfo(i, j));
                result = Math.max(bfs(map, new NodeInfo(i, j)), result);
            }
        }
        System.out.println(result);
    }

    public static int bfs(int[][] map, NodeInfo start) {
        int result = 1;
        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};
        Queue<NodeInfo> queue = new LinkedList<>();
        queue.add(start);
        store[start.x][start.y] = 1;
        while(!queue.isEmpty()) {
            NodeInfo now = queue.poll();
            for(int i = 0; i < 4; i++) {
                int x = now.x + moveX[i];
                int y = now.y + moveY[i];
                if(x < 0 || x >= map.length)
                    continue;
                if(y < 0 || y >= map[0].length)
                    continue;
                if(map[x][y] > map[now.x][now.y]) {
                    store[x][y] = store[now.x][now.y] + 1;
                    result = Math.max(result, store[x][y]);
                    queue.add(new NodeInfo(x, y));
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