package com.company.Algorithms.BinarySearch;

public class Count1s {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int[] nums = {0,0,0,0,0,1,1,1,1,1};
        int target = 1;
        System.out.println(countOnes(nums,target));

    }
    static int countOnes(int[] nums,int target){
        int s = 0;
        int count = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                count++;
                e = m-1;

            }
            else if(target<nums[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }

        }
        return count;
    }
}
