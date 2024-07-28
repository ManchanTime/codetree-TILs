import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < n; i++) {
            String in = br.readLine();
            map.put(in, map.getOrDefault(in, 0) + 1);
        }
        for (String s : map.keySet()) {
            result = Math.max(result, map.get(s));
        }
        System.out.println(result);
    }
}