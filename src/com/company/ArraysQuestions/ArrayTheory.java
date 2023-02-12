package com.company.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTheory {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
//        int[] arr = new int[5];
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you wanna Enter");
        int n = sc.nextInt();
//        for (int i = 0; i <= arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
////        for (int j = 0; j < n ; j++) {
////            System.out.println(arr[j]);
////        }
//        System.out.println(Arrays.toString(arr));
//    }
        String [] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString(str));
    }
}