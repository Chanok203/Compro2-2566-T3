package String;

import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String str = sc.nextLine();

        String a = str.substring(0, 3); // [0, 3) -> [0, 1, 2]
        String b = str.substring(1, 4);
        String c = str.substring(2, 5);
        String[] arr = {a, b, c};
        for (int i = 0; i<arr.length; ++i) {
            int idx = msg.indexOf(arr[i]);
            if (idx == -1) {
                System.out.println("No");
            } else {
                System.out.println(idx+1);
            }
        }
        sc.close();
    }
}
