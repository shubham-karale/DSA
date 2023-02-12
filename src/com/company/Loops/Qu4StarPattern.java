package com.company.Loops;

public class Qu4StarPattern {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        for (int i = 0; i <=4 ; i++) {
            for (int j= 4; j>=i; j--) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
