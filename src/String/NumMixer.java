package String;

import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; ++i) {
            b[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        boolean ab = (x > 0);
        for (int i = 0; i < a.length; ++i) {
            int sa = a[i];
            int sb = b[b.length - 1 - i];
            
            if (ab) {
                System.out.print(sa + " " + sb + " ");
            } else {
                System.out.print(sb + " " + sa + " ");
            }
        }
        System.out.println();
    }
}
