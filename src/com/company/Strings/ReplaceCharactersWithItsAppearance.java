package com.company.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceCharactersWithItsAppearance {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the Appearance Character: ");

       // char [] chaArr = str.toCharArray();
        char oc = 'h';
        int count = 1;
//        for (int i = 0; i < chaArr.length; i++) {
//            int count = 1;
//            if(chaArr[i]==oc){
//                chaArr[i] = String.valueOf(count).charAt(0);
//                count++;
//
//            }
//
//
//        }
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch==oc){
                str = str.replaceFirst(String.valueOf(oc),String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
}
