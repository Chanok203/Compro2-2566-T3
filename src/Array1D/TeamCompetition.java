package Array1D;
import java.util.Arrays;
import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < A.length; ++i) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; ++i) {
            B[i] = sc.nextInt();
        }

        // System.out.println("A: " + Arrays.toString(A));
        // System.out.println("B: " + Arrays.toString(B));
        sc.close();

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] > B[i]) {
                sumA += 2;
            } else if (A[i] == B[i]) {
                sumA += 1;
                sumB += 1;
            } else {
                sumB += 2;
            }
        }
        // System.out.println("sumA: " + sumA);
        // System.out.println("sumB: " + sumB);

        if (sumA > sumB) {
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d", sumA, sumB);
            System.out.println();
        } else if (sumA == sumB) {
            System.out.println("Draw game");
            System.out.printf("Score %d to %d", sumA, sumB);
            System.out.println();
        } else {
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d", sumB, sumA);
            System.out.println();
        }
    }
}
