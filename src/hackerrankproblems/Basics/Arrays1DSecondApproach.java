package hackerrankproblems.Basics;

import java.util.Scanner;

public class Arrays1DSecondApproach
{
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            a[i] = a[i]*2;

        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
