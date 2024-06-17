import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a >= 10 && a <= 20){
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}