package com.company.Loops;

import java.util.Scanner;

public class Qu1FactorialOfNumber {
    static int factorial(int n) {
        //return n*(n-1);
        int fact = 0;
        for (int i = 0; i <n ; i++) {
            if(n>0){
                fact = n*(n-1);
                
            }
            
        }
        return fact;
    }
    public static void main(String[] args) {
        int fact =0;
        System.out.println("Welcome to Java World");
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
//        for (int i = 0; i <n ; i++) {
//            if(n>0){
//                return n*(n-1);
//            }

        }

    }

