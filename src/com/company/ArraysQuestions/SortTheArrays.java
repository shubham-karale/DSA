package com.company.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the number you wann put in the arrays");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the arrays Elements:\n");
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
