import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String re = "no";
        if(a >= 3000){
            re = "book";
        }
        else if(a >= 1000){
            re = "mask";
        }
        else if(a >= 500){
            re = "pen";
        }
        System.out.println(re);
    }
}