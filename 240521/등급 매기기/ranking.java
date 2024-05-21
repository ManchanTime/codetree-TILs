import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String re = "F";
        if(a >= 90){
            re = "A";
        }
        else if(a >= 80){
            re = "B";
        }
        else if(a >= 70){
            re = "C";
        }
        else if(a >= 60){
            re = "D";
        }
        System.out.println(re);
    }
}