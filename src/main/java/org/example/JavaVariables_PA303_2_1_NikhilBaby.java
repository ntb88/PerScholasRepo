package org.example;

public class JavaVariables_PA303_2_1_NikhilBaby {
    public static void main(String[] args) {

        //sum of int
        int a;
        int b;
        a = 10;
        b = 4;
        int sum = a + b;
        System.out.println(sum);

        // sum of double
        double c = 1;
        double d = 2;
        double d_sum = c + d;
        System.out.println(d_sum);

        /*Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together. Assign the sum to a variable.
        Print out the result. What variable type must the sum be?
         */
        int a1; double c1;
        a1 = 10;
        c1 = 4;
        double sum1;
        sum1 =  a1+ c1;
        System.out.println(sum1);

        /*Write a program that declares two integer variables, assigns an integer to each, and divides the larger
        number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number
         to a decimal. What happens? What corrections are needed?
         */
        int div = a/b;
        System.out.println(div);
        //if double
        System.out.println("When one num is double: "+ a/d);
        System.out.println("When one number is double, the answer is a double. If you have a sum variable that is int, it needs to be type casted");
        //type casted
        div = (int) (a/d);
        System.out.println(div);

        /*Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
         */
        double x1;
        double y1;
        x1 = 10;
        y1 = 4;
        double div1 = x1/y1;
        System.out.println("Div large by smaller number: "+ div1);
        div = (int) (x1/y1);
        System.out.println("Div large by smaller number typed casted to int: "+ div);

        /*Write a program that declares two integer variables, x and y, and assigns
        the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q.
        Now, cast y to a double and assign it to q. Print q again.
         */
        int x, y;
        x = 5;
        y = 6;
        int q = y/x;
        System.out.println("int q "+ q);
        double p = y;
        q = (int)(double) (y);
        System.out.println("q is an int. So castig a double y needs to be casted to int to be assigned to q. So q is: "+  q) ;

        /*
        Write a program that declares a named constant and uses it in a calculation. Print the result.
         */
        final double PI = Math.PI;
        double sin = Math.sin(PI/2);
        System.out.println(sin);

        /*Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order”
        for three items of the first product, four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax
        to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
         */

        double coffee, cappuccino, espresso, subTotal, totalSale;
        coffee = 2;
        cappuccino = 3;
        espresso = 4;
        subTotal = (3 * coffee) + (4* cappuccino) + (2*espresso);
        final double SALES_TAX = 8.25;
        totalSale =  subTotal + (subTotal * SALES_TAX/100);
        System.out.println("subtotal is : "+ subTotal);
        System.out.println("total sale is : "+ totalSale);

    }
}
