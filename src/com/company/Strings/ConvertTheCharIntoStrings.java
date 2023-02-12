package com.company.Strings;
/*
Convert a list of characters into a String
Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks
Explanation: combined all the characters
to form a single string.
 */
public class ConvertTheCharIntoStrings {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        char [] ch = {'H','E','E','L','L','O','H','R','I','S','H','I'};
        int N = ch.length;
        System.out.println(N);
//
        System.out.println(chartostr(ch,N));

    }
    static String chartostr(char arr[], int N){
     return String.valueOf(arr);


        }


}
