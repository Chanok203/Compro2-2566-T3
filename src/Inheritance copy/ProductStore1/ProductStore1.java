package Inheritance.ProductStore1;

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

public class ProductStore1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Product[] products = new Product[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            products[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            boolean valid = products[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            products[i].printInfo();
        }
    }
}
