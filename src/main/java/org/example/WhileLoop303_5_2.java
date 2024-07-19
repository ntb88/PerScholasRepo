package org.example;

import java.util.Scanner;

public class WhileLoop303_5_2 {


    //Guess the number
    static void guessNumber(){

        int randomNumber = (int) (Math.random() *11);
        Scanner scan = new Scanner(System.in);


        int guess = -1;

        while( guess != randomNumber ) {
            System.out.println("Enter a number between 1 and 10 to guess: ");
            guess = scan.nextInt();
            if (guess == randomNumber) {
                System.out.println("You guessed correctly!");
            } else if (guess > randomNumber) {
                System.out.println("Your guess high!");
            } else {
                System.out.println("Your guess low!");
            }
        }
    }


    //Subtraction Quiz
    static void subtractionQuiz(){

        int count = 0;
        int num1, num2;

        while(count < 5) {
            num1 = (int) (Math.random() *11);
            num2 = (int) (Math.random() *11);

            if (num1 > num2){
                System.out.printf("What is %d - %d : %d%n", num1, num2, num1-num2);
            } else if (num2>num1){
                System.out.printf("What is %d - %d : %d%n", num2, num1, num2-num1);
            }else {
                System.out.printf("What is %d - %d : %d%n", num1, num2, num1-num2);
            }

            count++;
        }
    }



    //add numbers till the user terminate the loop
    static void addInts(){
        Scanner scan = new Scanner(System.in);
        int num = -1;
        int sum = 0;
        while(num !=0){
            System.out.println("Enter a number to add: ");
            num = scan.nextInt();
            sum +=num;
        }
        System.out.printf("Sum: %d%n", sum);
    }


    public static void main(String[] args) {
    guessNumber();
    subtractionQuiz();
    addInts();
    }
}
