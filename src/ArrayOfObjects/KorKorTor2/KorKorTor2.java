package ArrayOfObjects.KorKorTor2;

import java.util.Scanner;

class Precinct {
    String name;
    String[] partyNames;
    int[] scores;

    Precinct(String name, String[] partyNames) {
        this.name = name;
        this.scores = new int[partyNames.length];
        this.partyNames = new String[partyNames.length];
        for (int i = 0; i < this.partyNames.length; ++i) {
            this.partyNames[i] = partyNames[i];
        }
    }

    void count(int partyId) {
        if (partyId < 0 || this.partyNames.length <= partyId) {
            System.out.println("invalid number");
            return;
        }
        String partyName = this.partyNames[partyId];
        ++this.scores[partyId];
        System.out.println(partyName + " " + this.scores[partyId]);
    }

    void printInfo() {
        int L = this.partyNames.length;
        for (int i = 0; i < L; ++i) {
            System.out.println((i+1) + " " + this.partyNames[i] + " " + this.scores[i]);
        }
    }

    void printMax() {
        int L = this.partyNames.length;
        int max = -1;
        for (int i = 0; i < L; ++i) {
            if (this.scores[i] > max) {
                max = this.scores[i];
            }
        }

        for (int i = 0; i < L; ++i) {
            if (this.scores[i] == max) {
                System.out.println((i+1) + " " + this.partyNames[i] + " " + this.scores[i]);
            }
        }
    }

}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int N = sc.nextInt();
        String[] partyNames = new String[N];
        for (int i = 0; i < N; ++i) {
            partyNames[i] = sc.next();
        }
        Precinct precinct = new Precinct(name, partyNames);
        int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int action = sc.nextInt();
            if (action == 1) {
                int P = sc.nextInt() - 1;
                precinct.count(P);
            } else if (action == 2) {
                precinct.printInfo();
            } else {
                precinct.printMax();
            }
        }
    }
}
