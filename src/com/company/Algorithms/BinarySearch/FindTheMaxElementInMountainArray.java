package com.company.Algorithms.BinarySearch;

public class FindTheMaxElementInMountainArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {1,2,4,6,7,5,3,1,0};
        int finalAns = findMaxElement(arr);
        System.out.println(finalAns);

    }
    public static int findMaxElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
        //start and end are same at the highest element
        // start==end means Highest element in the array
    }
}
