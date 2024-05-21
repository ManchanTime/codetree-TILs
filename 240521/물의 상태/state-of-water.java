import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String re = "water";
        if(a < 0){
            re = "ice";
        }else if(a >= 100){
            re = "vapor";
        }
        System.out.println(re);
    }
}