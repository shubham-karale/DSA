package com.company.CoreJavaChallenge;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=10 ; i++) {
            System.out.println(n+"x "+i +"="+n*i);

        }
    }
}
