package com.company.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheStrings {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Words: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char [] s = str.toCharArray();
        String finalArr = "";
        for (int i = s.length-1; i >=0 ; i--) {
            finalArr+=s[i];

        }
       char [] finalArr1 = finalArr.toCharArray();
        System.out.println(finalArr1);
    }
}
