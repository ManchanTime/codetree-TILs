import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split("\\.");
        System.out.println(in[1] + "-" + in[2] + "-" + in[0]);
    }
}