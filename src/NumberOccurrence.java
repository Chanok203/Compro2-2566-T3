import java.util.Arrays;
import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // check input
        // System.out.println(Arrays.toString(arr));
        // System.out.println(x);
        
        boolean found = false;
        for (int i = 0; i < arr.length; ++i) {
            if (x == arr[i]) {
                found = true;
                System.out.print((i + 1) + " ");
            }
        }
        if (found == false) {
            System.out.print("0");
        }
        System.out.println();
        sc.close();
    }
}
