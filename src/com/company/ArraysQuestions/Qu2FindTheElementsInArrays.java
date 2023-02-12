package com.company.ArraysQuestions;

import java.util.Scanner;

public class Qu2FindTheElementsInArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the How the Many numbers you wanna Enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int findNum = 75;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();


        }
       for (int i = 0; i <arr.length ; i++) {
       if(arr[i]==findNum){
           System.out.println("We get that number"+arr[i]);
            break;
        }


        }
    }
}
