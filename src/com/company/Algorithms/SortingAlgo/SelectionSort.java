package com.company.Algorithms.SortingAlgo;

import java.util.Arrays;
/*
Set<Integer> duplicates = new HashSet<Integer>();
 for (int i = 0; i < arr.length; i++) { for (int j = 1; j < arr.length; j++)
 { if (arr[i] == arr[j] && i != j)
 { // duplicate element found
 duplicates.add(arr[i]);
  break;
  }
  }

   }
   return duplicates;


 */
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {29,72,98,13,87,66,52,51,36};
        selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr,int n){
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
           swap(arr,minIndex,i);
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
