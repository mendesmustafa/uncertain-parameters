package com.mendes;

public class Main {

    public static void main(String[] args) {

        System.out.println("Toplam: " + Operations.sum(2, 4, 6, 7, 8, 9, 14));
        System.out.println("Fark: " + Operations.subtract(10, 3, 2));
        System.out.println("Çarpım: " + Operations.multiply(3, 7, 4, 2, 5));
        System.out.println("Bölüm: " + Operations.divide(12, 4, 0, 3));

    }
}