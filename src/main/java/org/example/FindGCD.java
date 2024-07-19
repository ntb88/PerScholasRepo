package org.example;

public class FindGCD {
    public static void main(String[] args) {
        int a = 48, b = 18,  r;
        while (b != 0) {
            if (a > b) {
                r = a % b;
                a = b;
                b = r;
            }
        }
        System.out.println("GCD  is "+ a);

    }
}
