import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a >= 113){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}