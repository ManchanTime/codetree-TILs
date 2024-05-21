import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int score = Integer.parseInt(in[0]);
        String result = "failure";
        if(score == 100){
            result = "pass";
        }
        System.out.println(result);
    }
}