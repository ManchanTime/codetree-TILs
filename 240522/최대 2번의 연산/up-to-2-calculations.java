import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a % 2 == 0){
            a /= 2;
        }
        if(a % 2 != 0){
            a = (a+1) / 2;
        }
        System.out.println(a);
    }
}