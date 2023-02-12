package com.company.Algorithms.BinarySearch;

import java.util.ArrayList;

public class FindOccurencesof1sinBinaryArrays {
     public static void main(String[] args) {
         System.out.println("Welcome to DSA");
         int [] nums = {0,0,0,0,0,1,1,1,1,1};
         int target = 1;
         int firstOccurence = count1s(nums, target,true);
         int lastOccurence = count1s(nums, target,false);

         ArrayList<Integer> occurences = new ArrayList<Integer>();
         occurences.add(firstOccurence);
         occurences.add(lastOccurence);
         System.out.println(occurences);

     }
     static int count1s(int [] nums,int target,boolean searchFirst){
         int res = 0;
         int start = 0;
         int end = nums.length-1;
         while(start <= end){
             int mid = start+(end-start)/2;
             if(target==nums[mid]){
                 res = mid;
              //   count++;
                 //check at left side
                 if(searchFirst){
                     end = mid-1;

                 }
                 else{
                     start = mid+1;
                 }

             }
             else if(target<nums[mid]){
                 end = mid-1;
             }
             else{
                 start = mid+1;
             }
         }
         return res;
     }
    
}
