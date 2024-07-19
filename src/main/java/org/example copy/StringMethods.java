package org.example;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {


        //isEmpty()
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());
        //=============================


        //trim()
        s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+"how are you");
        //=============================


        //toLowerCase()
         s1="HELLO HOW Are You?";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
        //=============================


        //toUpperCase()
        s1="hello how are you";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
        //=============================

        //concat()
        String str1 = "Learn ";
        String str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "
        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
         s1 = "Supplement" + 'B'; // s1 becomes SupplementB

        System.out.println(s1);
        //=============================

        //split()
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        //=============================

        //charAt()
        message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));
        //=============================


        //compareTo()
        s1="hello";
        s2="hello";
        s3="hemlo";
        s4="flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        //=============================


        //substring
         str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));
        //=============================

        //indexOf()
         str1 = "Java is fun";
        int result1;

        // getting index of character 's'
        result1 = str1.indexOf('s');

        System.out.println(result1); // 6

        // getting index of character 'J'
        result1 = str1.lastIndexOf('J');
        System.out.println(result1); // 0

        // the last occurrence of 'a' is returned
        result1 = str1.lastIndexOf('a');
        System.out.println(result1); // 3

        // character not in the string
        result1 = str1.lastIndexOf('j');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str1.lastIndexOf("ava");
        System.out.println(result1); // 1

        // substring not in the string
        result1 = str1.lastIndexOf("java");
        System.out.println(result1); // -1
        //==============


        //contains()
        str1 = "Learn Java";
        Boolean result11;

        // check if str1 contains "Java"
        result11 = str1.contains("Java");
        System.out.println(result1);  // true

        // check if str1 contains "Python"
        result11 = str1.contains("Python");
        System.out.println(result11);  // false

        // check if str1 contains ""
        result11 = str1.contains("");

        System.out.println(result11);  // true
//=============

        //replace()
        str1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
//========================


       // replaceAll()
        str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));
//======================


        //equals()
        s1="PerScholas";
         s2="PerScholas";
         s3=new String("PerScholas");
         s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        //========================

        // == operator
        s1="Perscholas";
         s2="Perscholas";
         s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
        //==============================


        //compareTo()
         s1="Perscholas";
         s2="Perscholas";
         s3="Perschola";
         s4="PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )


    }
}
