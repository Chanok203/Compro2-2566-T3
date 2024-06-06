package Recursion;

public class Factorial {
    
    static int fact(int n) {
        // n! = n * (n-1) * (n-2) * ... * 1
        int v = 1; // 0!
        for (int i = n ; i >= 1; --i) {
            v *= i;
        }
        return v;
    }

    static int fact2(int n) { // n in [0, infinite)
        if (n < 1) {
            return 1; // 0!
        }
        // return n * fact2(n-1);
        int a = fact2(n-1); // (n-1)!
        int v = n * a;
        return v;
        
        // n! = n * (n-1)!
        // 5! = 5 * 4!
        // 5! = 5 * (4 * 3!)
        // 5! = 5 * (4 * (3 * 2!))
        // 5! = 5 * (4 * (3 * (2 * 1!)))
        // 5! = 5 * (4 * (3 * (2 * (1 * 0!))))
        // 5! = 5 * (4 * (3 * (2 * (1 * 1))))
    }

    public static void main(String[] args) {
        int n = 5;
        // n! = 5! = 5 * 4 * 3 * 2 * 1 = 120
        int v = fact(n);
        int v2 = fact2(n);

        System.out.printf("%d! = %d", n, v);
        System.out.println();

        System.out.printf("%d! = %d", n, v2);
        System.out.println();
    }
}
/**


0! = 1


(n-1)! = (n-1) * (n-2) * (n-3) * ... * 1



 */