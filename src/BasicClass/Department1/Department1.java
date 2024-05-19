package BasicClass.Department1;

import java.util.Scanner;

class Dept {

    int ministryBudget, eduFee, serviceFee, donation;

    Dept(int N, int K) {
        this.computeIncome(N, K);
    }

    void computeIncome(int N, int K) {
        this.ministryBudget = (N * 500_000) + (K * 3_000);
        this.eduFee = K * 5_000;
        this.serviceFee = 300_000;
        this.donation = 100_000;
    }

    void printReport() {
        System.out.println("ministry budget = " + this.ministryBudget);
        System.out.println("education fee = " + this.eduFee);
        System.out.println("service fee = " + this.serviceFee);
        System.out.println("donation = " + this.donation);
    }

}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int K = sc.nextInt();
        Dept d = new Dept(N, K);
        d.printReport();
        sc.close();
    }
}
