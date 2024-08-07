import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);
        Map<Integer, Integer> map = new HashMap<>();
        in = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            map.put(Integer.parseInt(in[i]), map.getOrDefault(Integer.parseInt(in[i]), 0) + 1);
        }

        int result = 0;
        for(int key : map.keySet()) {
            if(map.getOrDefault(key, 0) > 0 && map.getOrDefault(k - key, 0) > 0) {
                if(k % 2 == 0 && key == k / 2) {
                    result += map.get(key) * (map.get(k - key) - 1) / 2;
                }
                else{
                    result += map.get(key) * map.get(k - key);
                }
                map.put(k - key, 0);
            }
        }
        System.out.println(result);
    }
}