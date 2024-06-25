import java.io.*;
import java.util.*;

public class Main {

    public static int[][] DP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        DP = new int[N][N];
        for(int i = 0; i < N; i++) {
            String[] in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        DP[0][0] = map[0][0];
        for(int i = 1; i < N; i++) {
            DP[0][i] = map[0][i] + DP[0][i-1];
            DP[i][0] = map[i][0] + DP[i-1][0];
        }
        for(int i = 1; i < N; i++) {
            for(int j = 1; j < N; j++) {
                DP[i][j] = map[i][j] + Math.max(DP[i-1][j], DP[i][j-1]);
            }
        }
        System.out.println(DP[N-1][N-1]);
    }
}