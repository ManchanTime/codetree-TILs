import java.io.*;
import java.util.*;

public class Main {

    public static int result;
    public static int n;
    public static String[] possible;
    public static boolean[] used;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        possible = new String[]{"1", "22", "333", "4444"};
        used = new boolean[possible.length];
        result = 0;
        backTracking("");
        System.out.println(result);
    }

    public static void backTracking(String re) {
        if(re.length() == n){
            result++;
            return;
        }
        else if(re.length() > n){
            return;
        }
        for (String s : possible) {
            backTracking(re + s);
        }
    }
}