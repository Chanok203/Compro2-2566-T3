package Method;

import java.util.Scanner;

public class ProcessInfo {

    static boolean listProcesses(String[] names, int[] mems, int ram) {
        int L = names.length;
        int sum = 0;
        for (int i = 0; i < L; ++i) {
            String name = names[i];
            int mem = mems[i];

            if (mem >= 10 ) {
                name += "*";
            }
            System.out.println(name + " " + mem);
            sum += mem;
        }
        String line = String.format("RAM used = %d out of %d", sum, ram);
        System.out.println(line);
        return sum <= ram;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] mems = new int[n];
        for (int i = 0; i < n; ++i) {
            names[i] = sc.next();
            mems[i] = sc.nextInt();
        }
        int ram = sc.nextInt();

        boolean res = listProcesses(names, mems, ram);
        if (res) {
            System.out.println("Sufficient RAM");
        } else {
            System.out.println("Not enough RAM");
        }
    }
}
