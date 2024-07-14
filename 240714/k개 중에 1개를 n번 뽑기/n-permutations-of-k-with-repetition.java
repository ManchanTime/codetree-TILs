import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static boolean[] used;
    public static int[] store;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int K = Integer.parseInt(in[0]);
        N = Integer.parseInt(in[1]);
        used = new boolean[K + 1];
        store = new int[N];
        backTracking(0);
    }

    public static void backTracking(int index) {
        if(index == N) {
            for(int i = 0; i < N; i++) {
                System.out.print(store[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i < used.length; i++) {
            if(!used[i]) {
                store[index] = i;
                backTracking(index + 1);
            }
        }
    }
}