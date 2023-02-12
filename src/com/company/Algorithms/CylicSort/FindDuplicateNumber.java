package com.company.Algorithms.CylicSort;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] arr = {1,3,4,2,2};
        System.out.println(findDupliNum(arr));
    }
    public static  int findDupliNum(int[] arr){
        int i = 0;
        while(i< arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
