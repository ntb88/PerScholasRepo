package org.example;

public class TimeConverter {
    /*Write a java to convert total seconds to hr, mins and seconds
    input: 866399
    output: 23: 59: 59
     */
    public static void main(String[] args) {
        int seconds, minutes, hours;
        seconds = 86399;
        hours = seconds/3600;
        System.out.println(hours);

        minutes = seconds % 3600 / 60;
        System.out.println(minutes);
        seconds = seconds % 60;
        System.out.println(seconds);
    }

}
