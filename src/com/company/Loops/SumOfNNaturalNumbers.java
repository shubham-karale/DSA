package com.company.Loops;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
       int sum = 0;
//        for (int i = 0; i <=num ; i++) {
//            sum = sum+i;
//
//        }
        int i = 0;
        while(i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
