package com.company.ArraysQuestions.AlgorithsmQuestions;
/*
Find the Max Element in Mountain Arrays
 */

public class FindMaxElementInMountainArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {1,3,5,7,9,11,8,6,4,2,0};
       int target = 11;
        System.out.println();
    }
    int search(int[] arr, int target, int start, int end){
        int peak = peakIndexOfMountainArray(arr);
        int firstTry = orderAgnosticsArray(arr,target,start,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticsArray(arr,target,peak+1,arr.length-1);
    }
    public int peakIndexOfMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticsArray(int []arr,int target,int start,int end){
//        start = 0;
//         end = arr.length-1;
        boolean isAsc;
        isAsc = arr[start] < arr[end];
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else{
                if(arr[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
