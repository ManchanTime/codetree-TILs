import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int re1 = 1;
        int re2 = 1;
        if(a < b){
            re1 = 1;
        }else{
            re1 = 0;
        }
        
        if(a != b){
            re2 = 0;
        }else{
            re2 = 1;
        }
        System.out.println(re1 + " " + re2);
    }
}