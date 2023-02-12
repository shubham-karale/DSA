package com.company.Strings;

import java.util.Scanner;

/*
count of occurrence of the character 'a' on String:
 'Today is Monday' using Spring StringUtils 2
*/
public class CountTheOccurenceOfTheCharactersInString {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the String :");
/*        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();*/
        String str = "Today is Monday";
        char char_check = 'a';
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
