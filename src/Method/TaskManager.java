package Method;

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cpuAll = sc.nextInt();
        int ramAll = sc.nextInt();
        int cpuUsed = sc.nextInt();
        int ramUsed = sc.nextInt();
        
        reportLoad(cpuAll, ramAll, cpuUsed, ramUsed);
        sc.close();
    }

    static void reportLoad(int cpuAll, int ramAll, int cpuUsed, int ramUsed) {
        int c = cpuUsed * 100 / cpuAll;
        int r = ramUsed * 100 / ramAll;

        String line1 = String.format("CPU: %d/%d (%d%%)", cpuUsed, cpuAll, c);
        System.out.println(line1);

        String line2 = String.format("RAM: %d/%d (%d%%)", ramUsed, ramAll, r);
        System.out.println(line2);

        if (c >= 80) {
            System.out.println("Limited CPU power");
        }

        if (r >= 80) {
            System.out.println("Limited RAM availability");
        }
    }
}
