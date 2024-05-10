import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());
        System.out.printf("%.3f\n", (double)Math.round(a*1000)/1000);
        System.out.printf("%.3f\n", (double)Math.round(b*1000)/1000);
        System.out.printf("%.3f\n", (double)Math.round(c*1000)/1000);
    }
}