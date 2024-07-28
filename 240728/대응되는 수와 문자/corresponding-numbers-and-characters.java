import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        String get;
        for (int i = 1; i <= n; i++) {
            get = br.readLine();
            map.put(get, i);
            map2.put(i, get);
        };
        for(int i = 0; i < m; i++) {
            get = br.readLine();
            System.out.println(map.get(get) == null ? map2.get(Integer.parseInt(get)) : map.get(get));
        }
    }
}