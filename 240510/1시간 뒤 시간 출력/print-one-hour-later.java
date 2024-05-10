import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(":");
        int h = Integer.parseInt(in[0]) + 1;
        int m = Integer.parseInt(in[1]);
        System.out.println(h + ":" + m);
    }
}