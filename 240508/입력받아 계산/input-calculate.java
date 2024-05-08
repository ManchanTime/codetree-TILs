import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()) + 2;
        System.out.println(a);
    }
}