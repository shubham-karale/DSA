package com.company.Loops;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelNumber = 0;
        for (int ch = 0; ch <str.length() ; ch++) {
            char i = str.charAt(ch);
            if( i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ||
                    i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U'){
                vowelNumber++;

            }

        }
        System.out.println("Number of Vowels is :" + vowelNumber);
        if(vowelNumber%2==0){
            System.out.println("Even Vowels NUmber");
        }
        else{
            System.out.println("Odd Vowel Number");
        }
    }
}
