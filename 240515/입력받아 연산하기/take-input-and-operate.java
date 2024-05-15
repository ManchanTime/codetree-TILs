import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] in = br.readLine().split(" ");
        // int a = Integer.parseInt(in[0]) + 87;
        // int b = Integer.parseInt(in[1]) % 10;
        int a = Integer.parseInt(br.readLine()) + 87;
        int b = Integer.parseInt(br.readLine()) % 10;

        System.out.println(a + "\n" + b);
    }
}