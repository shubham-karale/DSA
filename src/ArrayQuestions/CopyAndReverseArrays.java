package ArrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CopyAndReverseArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Enter the Value of  N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int [] ans = Arrays.copyOf(arr,arr.length);
        int s = 0;
        int e = arr.length-1;
        for(int i = 0;i<n;i++)
        {
            int temp = arr[s];
            arr[e] = arr[s];
            arr[s] = temp;
        }

    }
}
