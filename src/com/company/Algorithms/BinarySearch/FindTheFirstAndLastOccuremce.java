package com.company.Algorithms.BinarySearch;

import java.util.Arrays;

public class FindTheFirstAndLastOccuremce {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr =  { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int target = 2;
        System.out.println(findFirstLastOccurence(arr,target));


    }
    static String findFirstLastOccurence(int[]arr, int target){
        int [] firstLast = {-1,-1};

        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]==target){
                if(firstLast[0]==-1){
                    firstLast[0] = i;

                }
                if(firstLast[0]!=-1){
                    firstLast[1] = i;

                }
            }
        }
        return Arrays.toString(firstLast);

    }
}
