import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] grid = new int[N][N];
        int result = 0;
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(in[j]);
            }
        }
        for(int i = 0; i < N - 2; i++) {
            for(int j = 1; j < N - 1; j++) {
                result = Math.max(result, bfs(grid, i, j, N));
            }
        }
        System.out.println(result);
    }

    public static int bfs(int[][] map, int startX, int startY, int N) {
        //대각선 왼쪽 아래, 대각선 오른쪽 아래, 대각선 오른쪽 위, 대각선 왼쪽 위
        //for 문 기준, 0, 1, 2, 3
        //0일 때 왼쪽 아래로 이동한 것
        int[] moveX = {+1, +1, -1, -1};
        int[] moveY = {-1, +1, +1, -1};
        int result = 0;
        Queue<NodeInfo> q = new LinkedList<>();
        q.add(new NodeInfo(startX, startY, -1, 0));
        while(!q.isEmpty()) {
            NodeInfo now = q.poll();
            if(now.type == -1) {
                NodeInfo n = calc(map, moveX, moveY, now, N, 0);
                if(n != null)
                    q.add(n);
            }
            else if(now.type == 0) {
                NodeInfo case1 = calc(map, moveX, moveY, now, N, 0);
                NodeInfo case2 = calc(map, moveX, moveY, now, N, 1);
                if(case1 != null)
                    q.add(case1);
                if(case2 != null)
                    q.add(case2);
            }
            else if(now.type == 1) {
                NodeInfo case1 = calc(map, moveX, moveY, now, N, 1);
                NodeInfo case2 = calc(map, moveX, moveY, now, N, 2);
                if(case1 != null)
                    q.add(case1);
                if(case2 != null)
                    q.add(case2);
            }
            else if(now.type == 2) {
                NodeInfo case1 = calc(map, moveX, moveY, now, N, 2);
                NodeInfo case2 = calc(map, moveX, moveY, now, N, 3);
                if(case1 != null)
                    q.add(case1);
                if(case2 != null)
                    q.add(case2);
            }
            else if(now.type == 3 && now.x == startX && now.y == startY) {
                result = Math.max(result, now.value);
            }
        }
        return result;
    }

    public static NodeInfo calc(int[][] map, int[] moveX, int[] moveY, NodeInfo now, int N, int i) {
        int x = now.x + moveX[i];
        int y = now.y + moveY[i];
        if(x < 0 || x >= N || y < 0 || y >= N)
            return null;
        return new NodeInfo(x, y, i, now.value + map[x][y]);
    }

    public static class NodeInfo {
        int x;
        int y;
        int type;
        int value;

        public NodeInfo(int x, int y, int type, int value) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.value = value;
        }
    }
}