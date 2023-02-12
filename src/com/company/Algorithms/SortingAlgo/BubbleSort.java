package com.company.Algorithms.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {5,4,3,2,1};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void BubbleSort(int[] nums){
        // lets start the counter for outer loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i ; j++) {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]=  nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
