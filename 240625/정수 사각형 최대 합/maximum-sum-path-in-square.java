import java.io.*;
import java.util.*;

public class Main {

    public static int[][] store;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        store = new int[N][N];
        NodeInfo start = new NodeInfo(0, 0);
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        bfs(map, start, N);
        System.out.println(store[N-1][N-1]);
    }

    public static void bfs(int[][] map, NodeInfo start, int N) {
        int[] moveX = {0, 1};
        int[] moveY = {1, 0};
        Queue<NodeInfo> q = new LinkedList<>();
        q.add(start);
        store[0][0] = map[0][0];
        while(!q.isEmpty()) {
            NodeInfo now = q.poll();
            for(int i = 0; i < 2; i++) { 
                int x = now.x + moveX[i];
                int y = now.y + moveY[i];
                if(x < 0 || x >= N)
                    continue;
                if(y < 0 || y >= N){
                    continue;
                }
                store[x][y] = Math.max(store[x][y], store[now.x][now.y] + map[x][y]);
                q.add(new NodeInfo(x, y));
            }
        }
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