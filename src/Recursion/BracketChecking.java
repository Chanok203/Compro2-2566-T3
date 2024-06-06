package Recursion;

import java.util.Scanner;

public class BracketChecking {
    public static boolean CheckBracket (String s){
        int a = s.indexOf("{");
        int b = s.lastIndexOf("}");
        // {       or        }
        if ((a == -1 && b != -1) || (a != -1 && b == -1)) {
            return false;
        }
        // ...
        if (a == -1 && b == -1) {
            return true;
        }
        // {...}    or  }...{
        if (b < a) {
            int c = a;
            a = b;
            b = c;
        }
        String x = s.substring(0, a);
        String y = s.substring(a+1, b);
        String z = s.substring(b+1);
        String s2 = x + y + z;
        return CheckBracket(s2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(CheckBracket(str));
    }
}
