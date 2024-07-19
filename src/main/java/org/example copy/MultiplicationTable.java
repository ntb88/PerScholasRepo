package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        int lower, upper;
        upper = 12;
        for (int i = 1; i <= upper; i++) {
            for (int j = 1; j <= upper; j++) {
                System.out.printf(" %d ", i*j);
            }
            System.out.println();
        }
    }
}
