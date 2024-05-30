package Inheritance.ProductStore2;

import java.util.Scanner;

class Product {
    String name, sku;
    double price;
    int weight;
    boolean valid;

    Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        this.valid = true;
        if (this.name == null || this.name.length() == 0) {
            System.out.println("name is invalid");
            this.valid = false;
        }
        if (this.sku == null || this.sku.length() == 0) {
            System.out.println("sku is invalid");
            this.valid = false;
        }
        if (this.price < 0) {
            System.out.println("price is invalid");
            this.valid = false;
        }
        if (this.weight < 0) {
            System.out.println("weight is invalid");
            this.valid = false;
        }
        return this.valid;
    }

    void printInfo() {
        String line = String.format("%s, %s, %s, %d",
                this.name, this.sku, this.price, this.weight);
        if (!this.valid) {
            line += ", Invalid";
        }
        System.out.println(line);
    }
}

class Shoe extends Product {
    int gender, size, type;
    String brand;

    Shoe(String name, String sku, double price, int weight, int gender, int size, int type, String brand) {
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }

    @Override
    void printInfo() {
        super.printInfo();
        String genderStr = "male";
        if (this.gender == 1) {
            genderStr = "female";
        }
        String typeStr = "casual";
        if (this.type == 1) {
            typeStr = "sport";
        } else if (this.type == 2) {
            typeStr = "formal";
        }
        String line = String.format("%s, %d, %s, %s",
                genderStr, this.size, typeStr, this.brand);
        System.out.println(line);
    }
}

public class ProductStore2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Shoe[] shoes = new Shoe[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            shoes[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            boolean valid = shoes[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            shoes[i].printInfo();
        }
    }
}
