import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double f = 30.48;
        double n = Double.parseDouble(br.readLine());
        System.out.println(Math.round(f * n * 10) / 10.0);
    }
}