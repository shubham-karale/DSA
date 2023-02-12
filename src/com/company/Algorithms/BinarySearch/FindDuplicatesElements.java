package com.company.Algorithms.BinarySearch;

import java.util.Arrays;

public class FindDuplicatesElements {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        int [] nums =  {1,3,4,2,2};
      //  System.out.println(findDuplicates(nums));
        System.out.println(findDuplicate1(nums));


    }
    static int findDuplicates(int [] nums){
       Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i <=nums.length-1; i++){
            if(i==nums[i]){
                res = nums[i];
            }

        }
        return res;

    }
        static int findDuplicate1(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1])
                    return nums[i];
            }

            return -1;
        }


    
}