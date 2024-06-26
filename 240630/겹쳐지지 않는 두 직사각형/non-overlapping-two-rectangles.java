import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int result = Integer.MIN_VALUE;
        int[][] grid = new int[N][M];
        for(int i = 0; i < N; i++) {
            in = br.readLine().split(" ");
            for(int j = 0 ; j < M; j++){
                grid[i][j] = Integer.parseInt(in[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                for(int k = i; k < N; k++) {
                    for(int t = j; t < M; t++) {
                        //System.out.println(calc(grid, i, j, k, t) + " --> " + i + " " + j + " " + k + " " + t);
                        int tmp = calc(grid, i, j, k, t);
                        int tmp2 = Integer.MIN_VALUE;
                        if(i == 0 && j == 0 && k == N - 1 && t == M - 1) {
                            continue;
                        }
                        //가로
                        int x1 = i - 1, x2 = k + 1;
                        if(x1 >= 0) {
                            for(int x = 0; x <= x1; x++) {
                                for(int y = 0; y <= M - 1; y++){
                                    for(int a = x; a <= x1; a++) {
                                        for(int b = y; b <= M - 1; b++){
                                            tmp2 = Math.max(tmp2, calc(grid, x, y, a, b));
                                        }
                                    }
                                    //tmp2 = Math.max(tmp2, calc(grid, 0, 0, x1, M - 1));
                                }
                            }
                        }
                        if(x2 < N){
                            for(int x = x2; x <= N - 1; x++) {
                                for(int y = 0; y <= M - 1; y++){
                                    for(int a = x; a <= N - 1; a++) {
                                        for(int b = y; b <= M - 1; b++){
                                            tmp2 = Math.max(tmp2, calc(grid, x, y, a, b));
                                        }
                                    }
                                    //tmp2 = Math.max(tmp2, calc(grid, 0, 0, x1, M - 1));
                                }
                            }
                            //tmp2 = Math.max(tmp2, calc(grid, x2, 0, N - 1, M - 1));
                        }
                        //새로
                        int y1 = j - 1, y2 = t + 1;
                        if(y1 >= 0) {
                            for(int x = 0; x <= N - 1; x++) {
                                for(int y = 0; y <= y1; y++){
                                    for(int a = x; a <= N - 1; a++) {
                                        for(int b = y; b <= y1; b++){
                                            tmp2 = Math.max(tmp2, calc(grid, x, y, a, b));
                                        }
                                    }
                                    //tmp2 = Math.max(tmp2, calc(grid, 0, 0, x1, M - 1));
                                }
                            }
                            //tmp2 = Math.max(tmp2, calc(grid, 0, 0, N - 1, y1));
                        }
                        if(y2 < M) {
                            for(int x = 0; x <= N - 1; x++) {
                                for(int y = y2; y <= M - 1; y++){
                                    for(int a = x; a <= N - 1; a++) {
                                        for(int b = y; b <= M - 1; b++){
                                            tmp2 = Math.max(tmp2, calc(grid, x, y, a, b));
                                        }
                                    }
                                    //tmp2 = Math.max(tmp2, calc(grid, 0, 0, x1, M - 1));
                                }
                            }
                            //tmp2 = Math.max(tmp2, calc(grid, 0, y2, N - 1, M - 1));
                        }
                        result = Math.max(result, tmp + tmp2);
//                        System.out.println(result + " " + tmp + " " + tmp2);
//                        System.out.println();
                    }
                }
            }
        }
        System.out.println(result);
    }

//    public static int bestCalc(int[][] grid, int startX, int startY, int endX, int endY) {
//        int count = 0;
//        boolean flag = false;
//        int result = Integer.MIN_VALUE;
//        for(int i = startX; i <= endX; i++) {
//            for(int j = startY; j <= endY; j++) {
//                count += grid[i][j];
//                if(!flag) {
//                    result = Math.max(result, count);
//                }
//            }
//        }
//        return result;
//    }

    public static int calc(int[][] grid, int startX, int startY, int endX, int endY) {
        int count = 0;
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                count += grid[i][j];
            }
        }
        return count;
    }

    public static class SquareInfo {
        int startX;
        int endX;
        int startY;
        int endY;
        int value;

        public SquareInfo(int startX, int endX, int startY, int endY, int value) {
            this.startX = startX;
            this.endX = endX;
            this.startY = startY;
            this.endY = endY;
            this.value = value;
        }
    }
}