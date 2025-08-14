package com.driver;

public class Main {




    // Inner class Product
    static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();

        int result1 = p.product(4, 5);
        System.out.println("Product of 4 and 5 = " + result1);

        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 = " + result2);

        double result3 = p.product(2.5, 4.5);
        System.out.println("Product of 2.5 and 4.5 = " + result3);
    }
}
