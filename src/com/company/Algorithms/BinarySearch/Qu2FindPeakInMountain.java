package com.company.Algorithms.BinarySearch;
/*
Find Element in an Mountain Array
 */
public class Qu2FindPeakInMountain {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums ={5,6,7,9,8,0,1,2,3,4};
        System.out.println(peakInMountainArray(nums));
    }
    static int peakInMountainArray(int[] nums){
       if(nums.length==1){
           return nums[0];
       }
       int start = 0;
       int end = nums.length-1;
       while (start<end){
           int mid = start+(end-start)/2;
           if(nums[mid]>nums[mid+1]){
               end = mid;
           }
           else if(nums[mid]<nums[mid+1]){
               start = mid+1;
           }
       }
       return start;

    }
}
