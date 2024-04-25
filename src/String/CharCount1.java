package String;

import java.util.Arrays;
import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int[] arr = new int[100]; // ช่องที่ใช้คือ [65, 90]
        for (int i = 0; i < msg.length(); ++i) {
            char c = msg.charAt(i);
            int code = (int) c;
            arr[code]++;
        }

        for (int i = 'A'; i <= 'Z'; ++i) {
            if (arr[i] == 0) {
                continue;
            }
            int count = arr[i];
            char c = (char) i;
            System.out.println(c + " " + count);
        }
    }
}
