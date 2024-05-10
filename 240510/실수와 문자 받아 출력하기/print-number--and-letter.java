import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.println(c);
        System.out.printf("%.2f\n", (double)Math.round(a*100)/100);
        System.out.printf("%.2f", (double)Math.round(b*100)/100);
    }
}