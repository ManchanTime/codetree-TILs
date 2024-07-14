import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int t = Integer.parseInt(in[1]);
        int[][] belt = new int[2][n];
        for(int i = 0; i < 2; i++) {
            in = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                belt[i][j] = Integer.parseInt(in[j]);
            }
        }
        for(int i = 0; i < t; i++) {
            move(belt, n);
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(belt[i][j] + " ");
            }
            System.out.println();
        }  
    }

    public static void move(int[][] belt, int n) {
        int tmp1 = belt[0][0], tmp2 = belt[1][0];
        int tmp = 0;
        for(int i = 1; i < n; i++) {
            tmp = belt[0][i];
            belt[0][i] = tmp1;
            tmp1 = tmp;

            tmp = belt[1][i];
            belt[1][i] = tmp2;
            tmp2 = tmp;
        }
        //System.out.println(tmp1 + " " + tmp2);
        belt[0][0] = tmp2;
        belt[1][0] = tmp1;
    }
}