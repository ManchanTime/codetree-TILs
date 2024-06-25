import java.io.*;
import java.util.*;

public class Main {

    public static int[][] DP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        DP = new int[N][N];
        List<NodeInfo> nodeInfoList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
                nodeInfoList.add(new NodeInfo(i, j, map[i][j]));
            }
        }
        nodeInfoList.sort(new Comparator<NodeInfo>() {
            @Override
            public int compare(NodeInfo o1, NodeInfo o2) {
                return o1.value - o2.value;
            }
        });
        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};
        for (NodeInfo nodeInfo : nodeInfoList) {
            for(int i = 0; i < 4; i++) {
                int x = nodeInfo.x + moveX[i];
                int y = nodeInfo.y + moveY[i];
                if(x < 0 || x >= N || y < 0 || y >= N) {
                    continue;
                }
                if(nodeInfo.value < map[x][y]) {
                    DP[x][y] = Math.max(DP[x][y], DP[nodeInfo.x][nodeInfo.y] + 1);
                }
            }
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                result = Math.max(result, DP[i][j]);
            }
        }
        System.out.println(result + 1);
    }

    public static class NodeInfo {
        int x;
        int y;
        int value;

        public NodeInfo(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}