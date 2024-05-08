package String;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String x = sc.nextLine();

        int idx = msg.indexOf(x);
        if (idx == -1) {
            System.out.println("no target character found");
            sc.close();
            return;
        }

        int start = 0;
        int count = 0;
        while (idx != -1) {
            String sub = msg.substring(start, idx);
            if (sub.length() > 0) {
                System.out.println(sub);
                count++;
            }

            start = idx + 1;
            idx = msg.indexOf(x, start);
        }
        String sub = msg.substring(start, msg.length());
        if (sub.length() > 0) {
            System.out.println(sub);
            count++;
        }
        
        if (count == 0) {
            System.out.println("no output");
        }
        sc.close();

    }
}
