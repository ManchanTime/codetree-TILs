import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        String tmp = s;
        s = t;
        t = tmp;
        System.out.println(s + "\n" + t);
    }
}