package com.company.Loops;

public class Qu5StarPAttern {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        for (int i = 0; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("*");
        }
    }
}
