package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuySellStockGFG {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Enter the length of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

    }

