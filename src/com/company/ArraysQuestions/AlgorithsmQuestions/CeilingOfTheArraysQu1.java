package com.company.ArraysQuestions.AlgorithsmQuestions;

public class CeilingOfTheArraysQu1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Algorithms");
        int [] arr = {2,5,7,9,12,15,19,65,75,83,106,146,182};
        int target =181;
        int finalAns = ceiling(arr,target);
        System.out.println(finalAns);

    }
    static int ceiling(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return start;
    }
}
