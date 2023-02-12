package com.company.Strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("\\s",""));
    }
}
