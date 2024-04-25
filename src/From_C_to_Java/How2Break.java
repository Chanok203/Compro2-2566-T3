package From_C_to_Java;
import java.util.Scanner;

public class How2Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            ++count;
        }
        System.out.println(count);
    }
}
