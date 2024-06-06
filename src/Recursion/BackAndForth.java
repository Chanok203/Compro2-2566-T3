package Recursion;

import java.util.Scanner;

public class BackAndForth {
    String reorder(String s, boolean forward) {
        int L = s.length();
        if (L <= 1) {
            return s;
        }
        if (forward) {
            char first = s.charAt(0);
            String right = s.substring(1);
            if (first == 'A') {
                return first + reorder(right, !forward);
            }
            return first + reorder(right, forward);
        }

        char last = s.charAt(L-1);
        String left = s.substring(0, L-1);
        if (last == 'A') {
            return last + reorder(left, !forward);
        }
        return last + reorder(left, forward);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
    }
}
