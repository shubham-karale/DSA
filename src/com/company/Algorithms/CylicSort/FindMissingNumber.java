package com.company.Algorithms.CylicSort;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] arr  =  {4,3,2,7,8,2,3,1};
        System.out.println(findMissingNumber(arr));
    }
    public static List<Integer> findMissingNumber(int[] nums){
        int i = 0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index <nums.length ; index++) {
            if(nums[index]!=index+1){
                ans.add(index+1);
            }

        }
        return  ans;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }
}
