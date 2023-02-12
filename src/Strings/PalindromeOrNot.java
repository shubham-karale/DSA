package Strings;

import java.util.Scanner;

public class PalindromeOrNot{
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        System.out.println(palindromeOrNot1333(str,n));
    }

    private static boolean palindromeOrNot1333(String str, int n) {
        String ans = "";
        boolean test = false;
        int s = 0,e = n-1;
        while(s<=e)
        {
            if(str.charAt(s)!=str.charAt(e))
            {
                test = false;
            }
            else {
                test = true;
            }
        }
        return test;

    }
}
