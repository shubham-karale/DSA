package ArrayQuestions;

import java.util.Scanner;

public class PrintArrayElementsInReverseOrder {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        System.out.println("Enter How many elements you want Print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];
        for (int i = 0; i < n ; i++) {
            num[i] = sc.nextInt();
        }
        printReverse(num,0);
    }
    static void printReverse(int [] num,int idx){
        //Base Condition
        if(idx== num.length){
            return;
        }
        printReverse(num,idx+1);
        System.out.println(num[idx]);

    }

}
