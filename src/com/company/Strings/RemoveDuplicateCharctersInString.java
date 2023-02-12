package com.company.Strings;

import java.util.Scanner;

public class RemoveDuplicateCharctersInString {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter your Strings : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb1 = new StringBuilder();
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            boolean repeated = false;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    repeated = true;

                }
                else{
                    i++;
                }

            }
            if(!repeated){
                sb1.append(arr[i]);
            }

        }
        System.out.println(str);
    }
}
