package hackerrankproblems.Basics;

import java.util.Scanner;

public class PrimeNumberPrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter your favourable Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%2 == 0||x%3==0||x%5==0||x%7==0||x%13==0) {
            System.out.println("NOt Prime Number");

        }
        else{
            System.out.println("Prime Number");
        }

    }
}
