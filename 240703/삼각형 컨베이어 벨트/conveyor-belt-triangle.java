import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int t = Integer.parseInt(in[1]);
        List<Deque<Integer>> dequeList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            dequeList.add(new ArrayDeque<Integer>());
            for(int j = 0; j < n; j++) {
                dequeList.get(i).add(Integer.parseInt(in[j]));
            }
        }
        for(int i = 0; i < t; i++) {
            moveBelt(dequeList, n);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(dequeList.get(i).pop() + " ");
            }
            System.out.println();
        }
    }
    public static void moveBelt(List<Deque<Integer>> dequeList, int n) {
        int tmp = 0;
        int last = 0;
        for(int i = 0; i < n - 1; i++) {
            tmp = dequeList.get(i).getLast();
            dequeList.get(i).removeLast();
            dequeList.get(i + 1).addFirst(tmp);
        }

        dequeList.get(0).addFirst(dequeList.get(n - 1).getLast());
        dequeList.get(n - 1).removeLast();
    }
}