package Recursion;

import java.util.Scanner;

public class SeparateCharactersAndNumbers {
    static String split(String msg) {
        int L = msg.length();
        if (L <= 1) {
            return msg;
        }
        char c = msg.charAt(0);
        String msg2 = msg.substring(1);

        String res = split(msg2);
        if(Character.isDigit(c)) {
            return res + c;
        }
        return c + res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
    }
}
