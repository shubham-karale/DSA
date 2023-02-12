package com.company.Algorithms.CylicSort;

import java.util.Arrays;

import static java.util.Arrays.*;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int [] arr){
        int i =0;
        while (i< arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
            for (int index = 0; index < arr.length ; index++) {
                if(arr[index]!=index){
                    return index;
                }
            }

        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

