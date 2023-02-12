package com.company.Loops;

import java.util.Scanner;

public class CalculatorCOdee {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Number 1");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the Number 2");
        int n2 = sc.nextInt();
        int button;
        int output;
        Scanner sc1 = new Scanner(System.in);
        button = sc1.nextInt();
        switch (button){
            case 1:
                output = n1+n2;
                System.out.println(output);
                break;
            case 2:
                output = n1-n2;
                System.out.println(output);
                break;
            case 3:
                output = n1*n2;
                System.out.println(output);
                break;
            case 4:
                output = n1/n2;
                System.out.println(output);
                break;
            case 5:
                output = n1%n2;
                System.out.println(output);
        }

    }
}
