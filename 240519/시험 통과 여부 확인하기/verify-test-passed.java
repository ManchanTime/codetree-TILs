import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n >= 80){
            System.out.println("pass");
        }
        else{
            System.out.println((80 - n) + " more score");
        }
    }
}