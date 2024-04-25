package From_C_to_Java;
import java.util.Scanner;

public class How2Break2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while (n!=0) {
            count++;
            n = sc.nextInt();
        }
        System.out.println(count);
    }
}
