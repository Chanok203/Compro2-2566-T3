package BasicClass.Theater2;

import java.util.Scanner;

class Theater {
    boolean threeD;
    boolean luxury;
    int numSeats;
    boolean[] seats;
    String title;
    int basePrice;

    Theater(boolean threeD, boolean luxury, int numSeats) {
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        this.seats = new boolean[numSeats + 1];
    }

    void setTitle(String title) {
        if (title == null || title.length() == 0) {
            System.out.println("invalid title");
        } else {
            this.title = title;
        }
    }

    void setBasePrice(int basePrice) {
        if (basePrice <= 0) {
            System.out.println("invalid price");
        } else {
            this.basePrice = basePrice;
        }
    }

    void printInfo() {
        if (this.threeD) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }

        if (this.luxury) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }

        System.out.println(this.seats.length - 1);

        if (this.title == null) {
            System.out.println("title is not set");
        } else {
            System.out.println(this.title);
        }

        if (this.basePrice == 0) {
            System.out.println("price is not set");
        } else {
            System.out.println(this.basePrice);
        }
    }

    int reserveOne(int seatNumber) {
        if (seatNumber <= 0 || seats.length <= seatNumber || seats[seatNumber] == true) {
            System.out.println("sorry");
            return -1;
        }
        seats[seatNumber] = true;
        return this.basePrice;
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        if (seatNumber <= 0 || seats.length < seatNumber + numSeats) {
            System.out.println("sorry");
            return -1;
        }
        for (int i = seatNumber; i < seatNumber + numSeats; ++i) {
            if (this.seats[i] == true) {
                System.out.println("sorry");
                return -1;
            }
        }


        for (int i = seatNumber; i < seatNumber + numSeats; ++i) {
            this.seats[i] = true;
        }

        return this.basePrice * numSeats;
    }
}

public class Theater2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }

        t.printInfo();
    }
}
