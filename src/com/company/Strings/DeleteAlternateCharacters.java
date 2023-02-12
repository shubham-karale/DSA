package com.company.Strings;

public class DeleteAlternateCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!!");
        String str = "GEEKS";
        int i = 1;
        String output = "";
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        if(i<n){
            sb = sb.deleteCharAt(i);
            i++;
        }
        System.out.println(sb);

    }
}