import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a == 5){
            System.out.println("A");
        }
        if(a % 2 == 0){
            System.out.println("B");
        }
    }
}