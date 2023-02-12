package com.company.Strings;

import java.util.Scanner;

public class ConcatenateAndThenReverseTheStrings {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String S1");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter the String S2");
        String s2 = sc.nextLine();
        System.out.println(conRevstr(s1,s2));

    }

    static String conRevstr(String S1, String S2) {
        // code here
        String finalString = S1 + S2;
        char[] s = finalString.toCharArray();
        int left = 0;
        int end = s.length;
        while(left<end)
        {
            char temp = s[left];
            s[left] = s[end];
            s[end] = temp;
            left++;
            end--;
        }
        String p = s.toString();

    return p;
    }

}


