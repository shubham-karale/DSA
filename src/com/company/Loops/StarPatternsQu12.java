package com.company.Loops;

public class StarPatternsQu12 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Welcome to Java Love");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");

        }

    }
}
