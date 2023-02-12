package com.company.Algorithms.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] arr = {8,65,95,105,116,127,139,148,165,173,182};
        int target = 175;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int start = 0;
        int ans = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            ans = mid+1;
        }
        return ans;

    }
}
