package ArrayQuestions;

import java.util.Scanner;

public class PrintTheArraysViaRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        printArrayElement(0,arr);
    }
    static void printArrayElement(int idx,int [] arr){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArrayElement(idx+1,arr);

    }
}
