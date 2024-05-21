import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String re = "Failure";
        switch(in) {
            case "S":
                re = "Superior";
                break;
            case "A":
                re = "Excellent";
                break;
            case "B":
                re = "Good";
                break;
            case "C":
                re = "Usually";
                break;
            case "D":
                re = "Effort";
                break;
        }
        System.out.println(re);
    }
}