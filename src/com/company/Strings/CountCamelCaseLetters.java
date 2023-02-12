package com.company.Strings;

import java.util.Scanner;

public class CountCamelCaseLetters {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(camelCase(str));

    }
    static int camelCase(String str){
       // char[] s = str.toCharArray();
        int count = 0;
        //char [] s = str.toCharArray();
        for (int i = 0; i <= str.length() ; i++) {
            if((int)str.charAt(i)>=65&&(int)str.charAt(i)<=90)
                count++;

        }
        return count;
    }
}
