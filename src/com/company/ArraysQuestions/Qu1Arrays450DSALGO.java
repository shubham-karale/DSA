package com.company.ArraysQuestions;
/*
Qu 1) Find the Largest and smallest Elements in an Arrays
 int [] arr = {45,850,65,960,456,123,789};
 maxNumber = 65
 minNumber=  960
 */
import java.util.Arrays;

public class Qu1Arrays450DSALGO {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {450,850,900,650,800,200};
        Arrays.sort(arr);
        int size = arr.length;
        int maxNumber = arr[size-1];
        int minNumber = arr[0];
        System.out.println("The Max Number in an arrays is : "+ maxNumber);
        System.out.println("The Min Number in an arrays is : "+ minNumber);
    }
}
/*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            int size = arr.length;
            int maxRes = arr[size - 1];
            System.out.println("The largest number: " + maxRes);
            int siz1 = arr.length;
            int minRes = arr[0];
            System.out.println("The smallest Number is " + minRes);
            int spanOfArrays = maxRes - minRes;
            System.out.println(spanOfArrays);

        }
 */