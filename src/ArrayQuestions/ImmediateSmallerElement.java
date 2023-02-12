package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Java ");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(immerdiateSmallerElement(arr)));
    }

    private static int[] immerdiateSmallerElement(int[] arr) {
        int [] ans = new int[arr.length];
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1])
            {
                arr[i] = arr[i+1];
            }
            else {
                arr[i] = -1;

            }
            ans[arr[arr.length - 1]] = -1;
        }
        return arr;
    }
}
