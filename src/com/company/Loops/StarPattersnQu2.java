package com.company.Loops;

import java.util.Scanner;

public class StarPattersnQu2 {
    public static void main(String[] args) {


        System.out.println("Welcome to Java Love");
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
    int rows = sc.nextInt();
        System.out.println("Enter Number of Columns");
    Scanner sc1 = new Scanner(System.in);
    int col = sc1.nextInt();

        for (int i = 1; i <= rows; i++) { // i Loops is used for the Number of column
            for (int j = 1; j <= col; j++) {
                // J loops is used for the number of rows
                if (i == 1 || i == rows || j == 1 ||j == col) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
//                System.out.println("");


            }
            System.out.println("");
        }
    }
}
