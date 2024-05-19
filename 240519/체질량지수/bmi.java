import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int h = Integer.parseInt(in[0]);
        int w = Integer.parseInt(in[1]);
        int b = (10000 * w) / (h * h);
        System.out.println(b);
        if(b >= 25){
            System.out.println("Obesity");
        }
    }
}