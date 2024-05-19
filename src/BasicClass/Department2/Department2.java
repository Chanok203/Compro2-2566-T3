package BasicClass.Department2;

import java.util.Scanner;

class Dept {

    int ministryBudget, eduFee, serviceFee, donation, salary, electricity, eduCost;

    Dept(int N, int K) {
        int income = this.computeIncome(N, K);
        int expense = this.computeExpense(N, K);

        System.out.println("total income = " + income);
        System.out.println("total expense = " + expense);
        System.out.println("income - expense = " + (income - expense));
    }

    int computeIncome(int N, int K) {
        this.ministryBudget = (N * 500_000) + (K * 3_000);
        this.eduFee = K * 5_000;
        this.serviceFee = 300_000;
        this.donation = 100_000;
        int sum = this.ministryBudget + this.eduFee + this.serviceFee + this.donation;
        return sum;
    }

    int computeExpense(int N, int K) {
        this.salary = N * 600_000;
        this.electricity = (N + K) * 2_000;
        this.eduCost = K * 4_000;
        int sum = salary + electricity + eduCost;
        return sum;
    }

    void printReport() {
        System.out.println("ministry budget = " + this.ministryBudget);
        System.out.println("education fee = " + this.eduFee);
        System.out.println("service fee = " + this.serviceFee);
        System.out.println("donation = " + this.donation);

        System.out.println("salary = " + this.salary);
        System.out.println("electricity = " + this.electricity);
        System.out.println("educational cost = " + this.eduCost);
    }

}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Dept d = new Dept(N, K);
        d.printReport();
        sc.close();
    }
}
