package com.company.Algorithms.BinarySearch;
// Qu Find the Element in the Array using Binary Arrays
public class BinarySearchTheory {
    public static void main(String[] args) {
        System.out.println("Welcome to Java World");
        System.out.println("Welcome to Binary Search Algorithms");
        int[] arr = {2, 5, 7, 12, 17, 19, 65, 85, 105, 120, 150};
        int target = 85;
        int finalAns = BinarySearch(arr,target);
        System.out.println(finalAns);

    }
    static int BinarySearch(int[]arr,int target) {
        int start = 0; // start is the fist element in the array
        int end = arr.length - 1; // end is the last element in the array
        while (start <= end) {
            // run the loops upto the start<=end
            //find the mid element of the arrays
            // int mid = (start+end)/2 But we don't use these because it may chances
            // that the we can cross the int data types limit
            // that is why we use the
            // int mid = start+(end-start)/2
            int mid = start + (end - start) / 2;
            //Check the target is less than the mid
            // if that condition is true then shift to the left direction
            if (target < arr[mid]) {
                end = mid - 1;
                // if 1st condition is false that means the target > mid element
                // so move the start element to the start = mid+1
            } else if (target > arr[mid]) {
                start = mid + 1;
                // else return mid that means target== mid element of the array
            } else {
                return mid;
            }
        }
        // if we can not find element in the array return -1
        return -1;
    }

    }

