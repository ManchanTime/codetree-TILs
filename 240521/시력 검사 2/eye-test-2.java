import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        double a = Double.parseDouble(in[0]);
        String re = "Low";
        if(a >= 1.0){
            re = "High";
        }
        else if(a >= 0.5){
            re = "Middle";
        }
        System.out.println(re);
    }
}