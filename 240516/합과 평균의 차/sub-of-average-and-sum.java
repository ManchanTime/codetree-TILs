import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = Integer.parseInt(in[2]);
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);
    }
}