package com.company.ArraysQuestions;

import java.util.Scanner;

// find the elements in the arrays and return its index
public class Qu2Ans {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Number you wanna type");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] arr = new int[n];

        int idx = -1;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("The Enter the number you wanna find out");
        int d = sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==d){
                idx = i;
                break;
            }


        }
        System.out.println("The Number which want to find out is"+idx);

    }

}
