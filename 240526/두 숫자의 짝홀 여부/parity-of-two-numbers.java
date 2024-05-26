import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        String re1 = "odd";
        String re2 = "odd";
        if(a % 2 == 0){
            re1 = "even";
        }
        if(b % 2 == 0){
            re2 = "even";
        }
        System.out.println(re1 + "\n" + re2);
    }
}