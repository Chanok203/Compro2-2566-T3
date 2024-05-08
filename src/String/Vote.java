package String;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N+1];
        for (int k = 0; k < K; ++k) {
            int x = sc.nextInt();
            ++arr[x];
        }

        int max = -1;
        int idx = -1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(idx);
        System.out.println(max);
        sc.close();
    }
}
