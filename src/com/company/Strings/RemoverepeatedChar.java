package com.company.Strings;

import java.util.Scanner;

public class RemoverepeatedChar {
    public static void main(String[] args)
    {
        System.out.println("Welcome to java Love!!!");
        System.out.println("Enter the String : ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "Today is Monday";
        StringBuilder sb = new StringBuilder();
        boolean repeated = false;
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    repeated = true;

                }
                else{
                    i++;
                }
            }
            if(!repeated){
                sb.append(arr[i]);
            }
            System.out.println(str);

        }
    }
}
