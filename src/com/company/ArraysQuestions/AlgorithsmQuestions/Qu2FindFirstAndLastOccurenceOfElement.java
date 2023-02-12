package com.company.ArraysQuestions.AlgorithsmQuestions;

public class Qu2FindFirstAndLastOccurenceOfElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Algorithms");
        int [] arr = {2,5,10,10,10,18,20};
        int target = 10;
        System.out.println(binarySearch(arr,target));
    }

   static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res=-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid+1;

            }
        }
        return res;
    }
}
