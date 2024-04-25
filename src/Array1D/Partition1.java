package Array1D;
import java.util.Arrays;
import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int ci = arr.length / 2;
        int cv = arr[ci];
        // System.out.println("arr: " + Arrays.toString(arr));
        // System.out.println("center_index: " + ci);
        // System.out.println("center_value: " + cv);

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] <= cv) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > cv) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }
}
