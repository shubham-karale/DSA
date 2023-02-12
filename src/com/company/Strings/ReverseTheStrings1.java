package com.company.Strings;

import java.io.OutputStream;
import java.util.Scanner;

public class ReverseTheStrings1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        System.out.println("Enter your String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] str1 = str.toCharArray();

    }

    public void reverseStrings(char[] str1) {
        int left = 0;
        int end = str1.length - 1;
        while (left < end) {
            char temp = str1[left];
            str1[left] = str1[end];
            str1[end] = temp;
            left++;
            end--;

        }


    }
}
