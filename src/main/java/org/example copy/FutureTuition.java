package org.example;

public class FutureTuition {
    public static void main(String[] args) {
        double current = 10000;
        final int FUTURE = 20000;
       int count = 0;
       while(current <= FUTURE){
           current = (current * 1.07) ;
           count ++;
           System.out.println(current + " " + count);
       }
        System.out.println("It takes "+ 10000 + " initial tuition "+ count+ " years to double at 7% rate");
    }
}
