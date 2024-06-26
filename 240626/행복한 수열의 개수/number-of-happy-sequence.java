import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int[][] map = new int[N][N];

        for(int i = 0; i < N; i++) {
            in = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(in[j]);
            }
        }
        int result = 0;
        int[] tmp;
        for(int i = 0; i < N; i++) {
            if(check(map[i], M)) { 
                result++;
            }
            tmp = new int[N];
            for(int j = 0; j < N; j++) {
                tmp[j] = map[j][i];
            }
            if(check(tmp, M)) {
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean check(int[] c, int m) {
        int previous = c[0];
        int count = 1;
        for(int i = 1; i < c.length; i++) {
            if(previous == c[i]) {
                count++;
            }else{
                if(count >= m) {
                    return true;
                }
                count = 1;
                previous = c[i];
            }
        }
        if(count >= m) {
            return true;
        }
        return false;
    }
}