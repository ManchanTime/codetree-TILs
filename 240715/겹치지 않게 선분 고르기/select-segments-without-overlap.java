import java.io.*;
import java.util.*;

public class Main {

    public static Point[] line;
    public static ArrayList<Point> store;
    public static int result;
    public static boolean[] used;
    public static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        used = new boolean[n];
        line = new Point[n];
        result = 0;
        store = new ArrayList<>();
        String[] in;
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            line[i] = new Point(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
        }
        backTracking(0);
        System.out.println(result);
    }

    public static void backTracking(int index) {
        if(index == n) {
            result = Math.max(result, store.size());
            // for (Point i : store) {
            //     System.out.println(i.x + " " + i.y);
            // }
            // System.out.println(store.size());
            // System.out.println();
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!used[i]) {
                used[i] = true;
                int x = line[i].x;
                int y = line[i].y;
                boolean flag = false;
                for(Point p : store) {
                    if (p.x <= x && p.y >= x || p.x <= y && p.y >= y || x <= p.x && y >= p.x || x <= p.y && y >= p.y) {
                        //System.out.println("overlap " + line[i].x + " " + line[i].y);
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    //System.out.println("-------- " + line[i].x + " " + line[i].y);
                    store.add(line[i]);
                    backTracking(index + 1);
                    store.remove(store.size() - 1);
                }else{
                    backTracking(index + 1);
                }
                used[i] = false;
            }
        }
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