import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in;
        int[] A = new int[2];
        int[] B= new int[2];
        in = br.readLine().split(" ");
        for(int i=0;i<2;i++) {
            A[i] = Integer.parseInt(in[i]);
        }
        in = br.readLine().split(" ");
        for(int i=0;i<2;i++) {
            B[i] = Integer.parseInt(in[i]);
        }

        if(A[0] > B[0] && A[1] > B[1]) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}