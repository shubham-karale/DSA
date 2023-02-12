package com.company.Loops;

import java.net.SocketOption;
import java.util.Arrays;

public class SheetStarPatterns5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j<=4-i ; j++) {
                System.out.print("");
            }
            System.out.println("*");
        }
    }
}
