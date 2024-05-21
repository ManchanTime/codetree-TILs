import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String re = "Vacancy";
        switch(a) {
            case 1:
                re = "John";
                break;
            case 2:
                re = "Tom";
                break;
            case 3:
                re = "Paul";
                break;
        }
        System.out.println(re);
    }
}