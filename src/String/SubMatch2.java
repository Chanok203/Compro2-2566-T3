package String;

import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String str = sc.nextLine();

        String[] arr = new String[str.length() - 2];
        for (int i = 0; i < arr.length; ++i) {
            String word = str.substring(i, i+3);
            arr[i] = word;
        }

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
