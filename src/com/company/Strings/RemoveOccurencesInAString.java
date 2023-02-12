package com.company.Strings;

import java.util.Scanner;

public class RemoveOccurencesInAString {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        Scanner sc  =new Scanner(System.in);
        String str = sc.nextLine();
        char key = 'e';
        System.out.println(removeOccurences(str,key));
    }
    static String removeOccurences(String str,char key){
        char [] ch = str.toCharArray();
        String res = "";
        for (int i = 0; i < str.length()-1; i++) {
            if(ch[i]!=key){
                res = res+ch[i];
            }
        }
        return res;
    }
}
