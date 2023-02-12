package com.company.ArraysQuestions.AlgorithsmQuestions;

public class Qu3CountTheNumbersInanArrayUsingBS {
    public static void main(String[] args) {
        System.out.println("Welcome to Algorithms");
    }
    static int countTheNumber(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        int res = 0;
        while (start<end){
            int mid = start+(end-start)/2;
            if(target==mid){
                return mid;
            }
            else if(target<mid){
               end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
