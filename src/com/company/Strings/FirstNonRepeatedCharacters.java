package com.company.Strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the Strings : ");
//
        String  str = "AABCDBE";
        for (int i = 0; i <str.length() ; i++) {
            boolean uniqChar = true;
            for (int j = 0; j <str.length() ; j++) {

                if(i!=j&&str.charAt(i) == str.charAt(j)){
                    uniqChar = false;
                }

            }
            if(uniqChar){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
