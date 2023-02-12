package com.company.Strings;

import java.util.Scanner;

public class RemoveAllSpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       String str1 = str.replaceAll("[!@#$%^&*()_=/-~`><;|]","");
        System.out.println(str1);

    }
}
