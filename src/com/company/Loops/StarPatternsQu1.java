package com.company.Loops;

import java.util.Scanner;

public class StarPatternsQu1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns");
        Scanner sc1 = new Scanner(System.in);
        int col = sc1.nextInt();

        for (int i = 1; i <=col ; i++) { // i Loops is used for the Number of column
            for (int j = 1; j <=rows ; j++) { // J loops is used for the number of rows
                System.out.print("*");

            }
            System.out.println("");


        }
    }
}
