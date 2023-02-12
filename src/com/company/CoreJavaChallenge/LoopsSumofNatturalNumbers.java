package com.company.CoreJavaChallenge;

import java.util.Scanner;

public class LoopsSumofNatturalNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <n ; i++) {
            sum = sum + i;

        }
        System.out.println("The Sum upto the "+n+ "is: "+ sum );
    }
}
