package Recursion;

import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        int L = str.length();
        if (L <= 1) {
            return str;
        }
        String left = str.substring(0, L-1);
        String res = dupRemove(left);

        char last = str.charAt(L-1);
        char last2 = str.charAt(L-2);
        if (last == last2) {
            return res;
        }
        return res + last;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}

// abbccccddef
// ab_c___d_ef

// abbccccdde f
