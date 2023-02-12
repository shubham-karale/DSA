package hackerrankproblems.Basics;

import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        System.out.println("Welcome to Programming");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[2];
        for (int i = 0; i <n ; i++) {
            a[i] = scanner.nextInt();

        }
        for (int i = 0; i <n ; i++) {
            a[i] = a[i]*2;
            System.out.println(a[i]);

        }
        }
    }

