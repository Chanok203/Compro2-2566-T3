package String;

import java.util.Scanner;

public class CutAndHide {

    static String cutRight(String msg, String x) {
        int idx = msg.lastIndexOf(x);
        if (idx == -1) {
            return msg;
        }
        return msg.substring(0, idx+x.length());
    }

    static String cutLeft(String msg, String x) {
        int idx = msg.indexOf(x);
        if (idx == -1) {
            return msg;
        }
        return msg.substring(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String x = sc.next();

        msg = cutLeft(msg, x);
        msg = cutRight(msg, x);
        
        String line = x;
        for (int i = 1; i < msg.length() -1 ; ++i) {
            if (x.charAt(0) == msg.charAt(i)) {
                continue;
            }
            line += msg.charAt(i);
        }
        line += x;
        System.out.println(line);
    }
}
