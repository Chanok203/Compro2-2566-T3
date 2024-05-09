package Array1D;

import java.util.Scanner;

public class Calculator_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] hist = new int[10];
        int count = 0;
        while(true) {
            int action = sc.nextInt();
            if (action == 0) {
                break;
            }

            if (action == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if ( a < 0 || n <= a || b < 0 || n <= b) {
                    System.out.println("error");
                    continue;
                }

                int sum = arr[a] + arr[b];
                System.out.println(sum);
                hist[count] = sum;
                count++;
            }

            if (action == 2) {
                if (count <= 0) {
                    System.out.println("none");
                    continue;
                }
                count--;
                System.out.println(hist[count]);
            }
        }
        if (count == 0) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < count; ++i) {
                System.out.print(hist[i] + " ");
            }
            System.out.println();
        }
    }
}
