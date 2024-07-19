package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        //fill
        int[] arrValues = new int [30];
        Arrays.fill(arrValues, 10);
        System.out.println(Arrays.toString(arrValues));

        // sort
        double [] dValue = {2, 3, 4, 5, 2, 5, 1,9};
        Arrays.sort(dValue);
        System.out.println(Arrays.toString(dValue));

        //copy one to another array Manual method
        int [] sourceArray = {1, 2, 3, 4, 5};
        int [] targetArray = new int [sourceArray.length];

        for (int i= 0; i< sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }

        System.out.println("target is: "+ Arrays.toString(targetArray));

        //clone method
        sourceArray = new int[]{2, 3, 4, 5};
        targetArray = sourceArray.clone();
        System.out.println("target in clone() is : "+ Arrays.toString(targetArray));

        //arrayCopy()
        String [] names = {"Nik", "Hasu", "Mom", "Pappa"};
        String [] copyNames = new String[names.length];
        System.arraycopy(names,0,  copyNames, 0, names.length);
        System.out.println(Arrays.toString(copyNames));

        //indexoutofbounds
        int[] x = new int[5];
        int i;
        for(i=0;i<x.length;i++){
            x[i] = i;
        }
        System.out.println(x[i]);



    }
}
