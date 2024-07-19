package org.example;

public class ForLoop303_5_1 {
    public static void main(String[] args) {
        //loop demo
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println("Java is fun!");
        }


        //Sum on n numbers
        n = 10;
        int sum= 0;
        for (int i = 1; i <= n; i++) {
            sum = sum +i;
        }
        System.out.printf("The sum of %d numbers : %d%n", n, sum);

        // palindrome
        String original, reverse= "";
        original = "ANa";
        for(int i = original.length()-1; i>= 0; i--){
            reverse =  reverse + original.charAt(i);
        }
        System.out.println("The original  is : "+ original);
        System.out.println("The reverse is : "+reverse);

        if (original.equals(reverse)){
            System.out.println("Palindrome");
        }
        System.out.println("Not Palindrome");


        // Pyramid
        n = 10;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
