package com.company.Loops;

public class PatternQu1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        for (int i = 4; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
