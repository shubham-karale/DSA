package com.company.ArraysQuestions;

import java.util.Scanner;

// Take input How many number you wanna Enter
// print that number stars
// suppose to be number is 4 make vertical bar of *
public class QU3BarChart {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the number you wanna enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0;i< arr.length-1;i++
             ) {
            for (int j = 0; j <=arr[i]; j++) {
                System.out.println("* \t");


            }
            System.out.println("");

        }
    }
}
