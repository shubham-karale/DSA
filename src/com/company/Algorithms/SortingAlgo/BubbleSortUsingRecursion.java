package com.company.Algorithms.SortingAlgo;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] arr = {5,4,3,2,1};
        bubbleSortRecursion(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSortRecursion(int [] arr, int r, int c) {
        if (r==0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSortRecursion(arr, r, c + 1);
        } else {
            bubbleSortRecursion(arr, r - 1, 0);
        }
       // return r;
    }
}
