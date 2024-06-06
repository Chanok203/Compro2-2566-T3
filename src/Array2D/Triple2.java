package Array2D;

import java.util.Scanner;

public class Triple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                arr[r][c] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        sc.close();

        for (int r = 0; r < R; ++r) {
            int a = -1;
            int b = -1;
            for (int c = 0; c < C-2; ++c) {
                int v1 = arr[r][c];
                int v2 = arr[r][c+1];
                int v3 = arr[r][c+2];
                if (v1 == x && v2 == x && v3 ==x) {
                    if (a == -1) {
                        a = c + 1;
                    }
                    b = c + 1;
                }
            }
            if (a == -1 && b == -1) {
                System.out.println("0");
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}
