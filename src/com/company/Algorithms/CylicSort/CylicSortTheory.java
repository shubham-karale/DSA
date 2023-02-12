package com.company.Algorithms.CylicSort;

import java.util.Arrays;

public class CylicSortTheory {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {3,5,2,1,4};
        Sort(arr);// Call the Sort the Methods
        System.out.println(Arrays.toString(arr));

    }
    // Method to Swap the Integers to Original Position
    static void Sort(int[] arr){
        //Counter Variable i
        int i = 0;
        // Run the Loop Until the i is less than the arr.length-
        while (i< arr.length){
            int correct = arr[i]-1;
            // Run the Loop Until the index and the value doesn't ,match
            // index  = Value - 1
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                // Iterate the Loop
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
