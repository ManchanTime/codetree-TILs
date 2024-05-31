import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        in = br.readLine().split(" ");
        int b = Integer.parseInt(in[0]);
        int c = Integer.parseInt(in[1]);
        int d = Integer.parseInt(in[2]);
        int e = Integer.parseInt(in[3]);

        System.out.println(a > b ? 1 : 0);
        System.out.println(a > c ? 1 : 0);
        System.out.println(a > d ? 1 : 0);
        System.out.println(a > e ? 1 : 0);
    }
}