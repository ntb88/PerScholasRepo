package org.example;

public class JavaOperatorsAndNumbers303_2_3 {
    public static void main(String[] args) {

        /*
        1. Write a program that declares an integer a variable x, assigns the value 2 to it,
        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        Before printing the results, write a comment with the predicted decimal value and binary string.
        Now, print out x in decimal form and in binary notation.
        Perform the preceding exercise with the following values:
        9
        17
        88
         */
        System.out.println("Left shift operation");
        System.out.println("For x = 9: ");
        int x = 9;
        String y =  Integer.toBinaryString(x);
        System.out.println(y);
        //left shift
        x = x << 1;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 18
        System.out.println(x);
        //predicted binary value = 10010
        System.out.println(y);

        System.out.println("=================");

        System.out.println("For x = 17: ");
        x = 17;
        y =  Integer.toBinaryString(x);
        System.out.println(y);
        //left shift
        x = x << 1;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 34
        System.out.println(x);
        //predicted binary value = 100010
        System.out.println(y);

        System.out.println("=================");

        System.out.println("For x = 88: ");
        x = 88;
        y =  Integer.toBinaryString(x);
        System.out.println(y);
        //left shift
        x = x << 1;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 176
        System.out.println(x);
        //predicted binary value = 10110000
        System.out.println(y);
        System.out.println("=================");



        /*2. Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string
        version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value of x and the binary string.
        Perform the preceding exercise with the following values:
        a. 225
        b. 1555
        c. 32456
         */
        System.out.println("Right shift operation");
        System.out.println("For x = 150: ");
        x = 150;
        y =  Integer.toBinaryString(x);
        System.out.println("Binary of "+ x +" is "+y);
        //left shift
        x = x >> 2;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 37
        System.out.println("x after right shift operation: "+ x);
        //predicted binary value = 100101
        System.out.println("The binary string of x after right shift operation: "+y);
        System.out.println("=================");

        System.out.println("For x = 225: ");
        x = 225;
        y =  Integer.toBinaryString(x);
        System.out.println("Binary of "+ x +" is "+y);
        //left shift
        x = x >> 2;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 56
        System.out.println("x after right shift operation: "+ x);
        //predicted binary value = 111000
        System.out.println("The binary string of x after right shift operation: "+y);
        System.out.println("=================");


        System.out.println("For x = 1555: ");
        x = 1555;
        y =  Integer.toBinaryString(x);
        System.out.println("Binary of "+ x +" is "+y);
        //left shift
        x = x >> 2;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 388
        System.out.println("x after right shift operation: "+ x);
        //predicted binary value = 110000100
        System.out.println("The binary string of x after right shift operation: "+y);
        System.out.println("=================");

        System.out.println("For x = 32456: ");
        x = 32456;
        y =  Integer.toBinaryString(x);
        System.out.println("Binary of "+ x +" is "+y);
        //left shift
        x = x >> 2;
        y =  Integer.toBinaryString(x);
        // predicted decimal value = 8114
        System.out.println("x after right shift operation: "+ x);
        //predicted binary value = 1111110110010
        System.out.println("The binary string of x after right shift operation: "+y);
        System.out.println("=================");


        /*
        3. Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
        Write a comment that indicates what you predict will be the result of the bitwise and operation
        on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
         */

        int a;
        int b;
        a = 7; //binary string : 00111
        b = 17;//binary string : 10001

        int c = a & b;//binary : 00001
        //decimal result is : 1
        System.out.println(c);
        System.out.println("=================");
        /*
        4. Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        As before, write a comment that indicates what you predict the values to be before printing them out.
         */

        a = 7; //binary string : 00111
        b = 17;//binary string : 10001

        c = a | b;//binary     : 10111
        // decimal value is 23
        System.out.println(c);
        System.out.println("=================");
        /*
        5. Write a program that declares an integer variable, assigns a number, and uses a postfix increment
        operator to increase the value. Print the value before and after the increment operator.
         */

        int p = 3;
        System.out.println("value BEFORE postfix increment operation "+ p);
        p++;
        System.out.println("value AFTER postfix increment operation "+ p);
        System.out.println("=================");

        /*
        6.Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
         */
        int q = 2;
        System.out.println("value of q : "+ q);

        System.out.println("value of q++:  "+ q++);
        ++q;
        System.out.println("value of ++q : "+ q);
        q = q+1;
        System.out.println("value of q+1 : "+ q);

        /*
        7. Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        Create another variable sum and assign the value of ++x added to y, and print the result.
        Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
        Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while
        the second configuration calculated the sum, and then incremented x.
         */

        int r, s;
        r = 5; s = 8;
        int sum;
        sum = ++r + s;
        System.out.println(" (prefix) Sum is : "+ sum);

        r=5;
        sum = r++ + s;
        System.out.println(" (postfix) Sum is : "+ sum);

    }
}
