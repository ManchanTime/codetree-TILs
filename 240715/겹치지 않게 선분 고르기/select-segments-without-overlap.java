import java.io.*;
import java.util.*;

public class Main {

    public static Point[] line;
    public static Point[] store;
    public static int result;
    public static boolean[] used;
    public static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        used = new boolean[n];
        line = new Point[n];
        result = 0;
        store = new Point[n];
        String[] in;
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            line[i] = new Point(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
        }
        Arrays.sort(line, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.x == o2.x)
                    return o1.y - o2.y;
                return o1.x - o2.x;
            }
        });
        backTracking(0, true);
        System.out.println(result);
    }

    public static void backTracking(int index, boolean flag) {
        if(!flag) {
            result = Math.max(result, index);
 
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!used[i]) {
                used[i] = true;
                if(index == 0 || line[i].x >= store[index - 1].y) {
                    store[index] = line[i];
                    backTracking(index + 1, true);
                }else{
                    backTracking(index, false);
                }
                used[i] = false;
            }
        }
        backTracking(index, false);
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}