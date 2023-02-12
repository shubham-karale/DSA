package com.company.Algorithms.BinarySearch;

/*
 Find the Element in an Rotated Sorted Arrays
 input = nums = {8,11,13,15,1,4,6};
         target = 1;
         output = 4
 */
public class SearchElemInAnRotatedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] arr = {8,11,13,15,1,4,6};
        int target = 1;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==target){
//                System.out.println(i);
//            }
//        }
        System.out.println(search(arr,target));
        //System.out.println(searchInRoatatedArray(arr,target));
    }
    static int searchInRoatatedArray(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<=nums[end]){
                if(target>=nums[mid] && target<=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    static int search(int [] nums,int target){
        int ans = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i]==target) {
                ans = i;
                return ans;
            }
            else{
                return -1;
            }
        }
        return ans;
    }

}
