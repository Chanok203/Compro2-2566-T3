package Inheritance.TestUndergraduate;

import java.util.Scanner;

class Student {
    final static int NUM_TEST = 4;
    public String firstName;
    public String lastName;
    private int[] stepScore;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stepScore = new int[Student.NUM_TEST];
    }

    int getTestScore(int i) {
        return this.stepScore[i - 1];
    }

    void setTestScore(int i, int v) {
        this.stepScore[i - 1] = v;
    }

    int computeTotal() {
        int sum = 0;
        for (int i = 0; i < this.stepScore.length; ++i) {
            sum += this.stepScore[i];
        }
        return sum;
    }

    void printInfo() {
        int total = this.computeTotal();
        String line = String.format("%s %s %d", this.firstName, this.lastName, total);
        System.out.println(line);
    }
}

class Undergraduate extends Student {
    public int id;
    private String stepLevel;
    private boolean engPass;

    Undergraduate(int id, String fname, String lname) {
        super(fname, lname); // *****************

        this.id = id;
        this.stepLevel = "";
        this.engPass = false;
    }

    String computeLevel() {
        int total = this.computeTotal();
        if (total <= 0 || 120 < total) {
            for (int i = 1; i <= Student.NUM_TEST; ++i) {
                this.setTestScore(i, 0);
            }
            this.stepLevel = "NA";
            System.out.print("Invalid score");
            return this.stepLevel;
        }
        if (total < 76) {
            this.engPass = false;
            System.out.print("Not pass");
        } else {
            this.engPass = true;
            System.out.print("Pass");
        }
        if (total <= 25) {
            this.stepLevel = "A1";
        } else if (total <= 50) {
            this.stepLevel = "A2";
        } else if (total <= 75) {
            this.stepLevel = "B1";
        } else if (total <= 100) {
            this.stepLevel = "B2";
        } else {
            this.stepLevel = "C1";
        }
        return this.stepLevel;
    }

    @Override // optional
    void printInfo() {
        System.out.print(this.id + " ");
        super.printInfo();

        String lv = this.computeLevel();
        System.out.println(" " + lv);
    }
}

public class TestUndergraduate {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Undergraduate[] roster = new Undergraduate[N];
        for (int i = 0; i < N; i++) {
            int id = scan.nextInt();
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Undergraduate(id, fname, lname); //
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score); //
            }
        }
        boolean found = false;
        int rosterId = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if (roster[i].id == rosterId) { //
                roster[i].printInfo(); //
                for (int j = 1; j <= 4; j++) {
                    System.out.print(roster[i].getTestScore(j) + " "); //
                }
                found = true; //
            }
        }
        if (!found) {
            System.out.println("Not found"); //
        }
    }
}
