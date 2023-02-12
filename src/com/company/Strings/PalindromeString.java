package com.company.Strings;

import java.util.Scanner;

public class PalindromeString {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Java World!!!");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str = str.toLowerCase();
//        boolean flag = true;
//        for (int i = 0; i <str.length()/2 ; i++) {
//            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//                flag = false;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("The Given String is Palindrome");
//        }
//        else{
//            System.out.println("Not a Palindrome");
//        }
//    }
public static void main(String[] args) {
    System.out.println("Welcome to Java Love");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.toLowerCase();
    System.out.println(checkPalindrome(str));

}
static String checkPalindrome(String str){
    boolean flag = true;
    int count = 0;
    String s = "";
    for (int i = 0; i <str.length()/2 ; i++) {
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            flag = false;
            break;
        }
        else {
            s = s+str.charAt(i);
        }
    }
    return s;
}
}
