package String;

import java.util.Scanner;

public class CutAndHide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        while (true) {
            int action = sc.nextInt();
            if (action == 0) {
                break;
            }
            String x = sc.next();
            if (action == 1) {
                int idx = msg.indexOf(x);
                if (idx != -1) {
                    msg = msg.substring(idx);
                }
            }

            if (action == 2) {
                int idx = msg.lastIndexOf(x);
                if (idx != -1) {
                    msg = msg.substring(0, idx) + x;
                }
            }
            if (action == 3) {
                int idx1 = msg.indexOf(x);
                int idx2 = msg.lastIndexOf(x);
                if (idx1 != -1) {
                    msg = msg.substring(idx1, idx2) +x;
                }
            }
            System.out.println(msg);
        }
    }
}
