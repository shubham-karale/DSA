package com.company.Algorithms.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {1,2,8,10,12,19,24};
        int target = 18;
        System.out.println(ceiling(nums,target));
    }
    static int ceiling(int [] nums,int target){
        int start = 0;
        int ans = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            ans = mid+1;
        }

        return ans;
    }
}
