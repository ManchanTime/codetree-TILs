import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]) + 8;
        int b = Integer.parseInt(in[1]) * 3;

        System.out.println(a + "\n" + b + "\n" + a * b);
    }
}