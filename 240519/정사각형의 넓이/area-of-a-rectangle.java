import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = n * n;
        System.out.println(size);
        if(n < 5){
            System.out.println("tiny");
        }
    }
}