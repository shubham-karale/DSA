package TestingProblems;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the last Num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 2; j <i ; j++) {
                if(i%j!=0){
                    System.out.println(i);
                }
            }

        }
    }
}
