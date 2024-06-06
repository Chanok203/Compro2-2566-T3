package Recursion;

import java.util.Scanner;

public class RemoveAnyDup {
    String removeAnyDup(String str) {
        int L = str.length();
        if (L <= 1) {
            return str;
        }
        String left = str.substring(0, L-1);
        String right = str.substring(L-1);
        int i = left.indexOf(right);

        String res = removeAnyDup(left);
        if (i == -1) {
            return res + right;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.print(result);
    }
}
