package ArrayOfObjects.KorKorTor1;

import java.util.Scanner;

class Party {

    String title;
    int n;

    String[] fnames;
    String[] lnames;
    int[] regionIds;

    Party(String title, int n, Scanner sc) {
        this.title = title;
        this.n = n;

        this.fnames = new String[n];
        this.lnames = new String[n];
        this.regionIds = new int[n];

        for (int i = 0; i < n; ++i) {
            fnames[i] = sc.next();
            lnames[i] = sc.next();
            regionIds[i] = sc.nextInt();
        }
    }

    void printInfo(int id) {
        if (id < 0) {
            System.out.println("invalid region number");
            return;
        }

        if (id == 0) {
            for (int i = 0; i < this.n; ++i) {
                String line = String.format("%s %s %d", this.fnames[i], this.lnames[i], this.regionIds[i]);
                System.out.println(line);
            }
            return;
        }

        boolean printed = false;
        for (int i = 0; i < this.n; ++i) {
            if (this.regionIds[i] == id) {
                String line = String.format("%s %s", this.fnames[i], this.lnames[i]);
                System.out.println(line);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println("none");
        }


    }
}

public class KorKorTor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] partyNames = new String[N];
        int[] partyMembers = new int[N];
        for (int i = 0; i < N; ++i) {
            partyNames[i] = sc.next();
            partyMembers[i] = sc.nextInt();
        }
        Party[] parties = new Party[N];
        for (int i = 0; i < N; ++i) {
            parties[i] = new Party(partyNames[i], partyMembers[i], sc);
        }
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = sc.nextInt() - 1;
            int regionNumber = sc.nextInt();
            parties[partyNumber].printInfo(regionNumber);
        }
    }
}
