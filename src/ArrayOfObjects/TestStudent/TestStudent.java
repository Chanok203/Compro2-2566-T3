package ArrayOfObjects.TestStudent;

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

public class TestStudent {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];
        for (int i = 0; i < N; i++) {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname, lname); // Your code: create student object
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score); // Your code: call setTestScore
            }
            roster[i].printInfo(); // Your code: call printInfo
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int rosterNum = scan.nextInt()-1;
            int testNum = scan.nextInt();
            Student student = roster[rosterNum];
            System.out.println(student.getTestScore(testNum)); /** call getTestScore */
        }
    }
}
