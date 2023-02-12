package com.company.Strings;

import java.util.Scanner;
/*
 Shubham
 i = s
 j = h
 if i>j  is right
 then swap code is performed in which the h is replaced with the h
 */

public class SortTheStrings {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] arr  = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(new String(arr));
    }
}
