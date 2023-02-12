package com.company.Loops;/*
1 2 3 4
5 6 7 -
8 9 - -
10 - - -
*/

import java.security.spec.RSAOtherPrimeInfo;

public class StarPatternsQu11 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int num = 1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println("");

        }
    }
}
