import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] in;
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            if(in[0].equals("add")) {
                map.put(Integer.parseInt(in[1]), Integer.parseInt(in[2]));
            }else if(in[0].equals("remove")) {
                map.remove(Integer.parseInt(in[1]));
            }else if(in[0].equals("find")) {
                System.out.println(map.get(Integer.parseInt(in[1])) == null ? "None" : map.get(Integer.parseInt(in[1])));
            }
        }
    }
}