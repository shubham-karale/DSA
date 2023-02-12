package com.company.ArraysQuestions;

public class Array2DTheory {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9
                }
        };
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+" ");


            }


        }
    }
}
