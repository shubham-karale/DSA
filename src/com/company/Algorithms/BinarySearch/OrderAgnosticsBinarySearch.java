package com.company.Algorithms.BinarySearch;
// Find the element in the Arrays

public class OrderAgnosticsBinarySearch {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Welcome to Algorithms");
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
//        int [] arr = {89,75,65,63,58,53,45,40,33,23,19,13,11,5};
        int target = 89;
        int finalAns = orderAgnosticsBS(arr,target);
        System.out.println(finalAns);
    }
    static int orderAgnosticsBS(int[]arr,int target){
       int start  = 0;
      int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end =mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
