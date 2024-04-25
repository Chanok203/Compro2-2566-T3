package From_C_to_Java;
import java.util.Scanner;

public class OddVsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < n ; ++i) {
            int number = sc.nextInt();
            if (number % 2 == 0) { // even
                sumEven += number;
            } else { // odd
                sumOdd += number;
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("even");
        } else if (sumEven == sumOdd) {
            System.out.println("equal");
        } else {
            System.out.println("odd");
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        sc.close();
    }
}
