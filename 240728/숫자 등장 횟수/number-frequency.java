import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            map.put(Integer.parseInt(in[i]), map.getOrDefault(Integer.parseInt(in[0]), 0) + 1);
        }
        in = br.readLine().split(" ");
        for(int i = 0; i < m; i++) {
            sb.append(map.getOrDefault(Integer.parseInt(in[i]), 0)).append(" ");
        }
        System.out.println(sb);
    }
}