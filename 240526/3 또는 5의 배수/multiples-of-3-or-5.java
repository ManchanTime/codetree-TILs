import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String re1 = "";
        String re2 = "";
        if(a % 3 == 0){
            re1 = "YES";
        }
        else{
            re1 = "NO";
        }
        if(a % 5 == 0){
            re2 = "YES";
        }
        else{
            re2 = "NO";
        }
        System.out.println(re1 + "\n" + re2);
    }
}