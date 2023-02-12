package com.company.ArraysQuestions;

import java.util.Scanner;

public class ArraysMaxAndMinInArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter Array Elements: \n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the arrays elements:\n");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
               min =  arr[i];
            }


        }
        System.out.println("The Max Number in an Arrays is :"+max);
        System.out.println("The Min Number in an Arrays is : "+min);
    }
}
