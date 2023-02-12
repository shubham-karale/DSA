package com.company.Algorithms.SortingAlgo;

import java.util.Arrays;

public class BubbleSortLoveBabbar {
    static void swap(int []arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        bubbleSortLB(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSortLB(int [] arr,int n)
    {
        // If i starts from 0 then loops runs to n-1
        // If i starts from 1 then loops runs to n
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
}
