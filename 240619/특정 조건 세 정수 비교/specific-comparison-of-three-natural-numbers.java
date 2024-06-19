import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = Integer.parseInt(in[2]);
        int min = Math.min(Math.min(a,b),c);
        if(a == min){
            System.out.print(1 + " ");
        }
        else{
            System.out.print(0 + " ");
        }
        if(a == b && a == c) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}