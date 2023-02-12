package LeetCode;

import java.util.Arrays;

public class ReverseTheArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        int [] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <n/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]  = temp;
        }
    }

}
