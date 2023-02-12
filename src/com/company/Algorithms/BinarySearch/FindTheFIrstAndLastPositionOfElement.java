package com.company.Algorithms.BinarySearch;
/*
Qu Find the first and last element of index and return the Index of the array element
arr = [5,6,7,7,7,7,7,8,8,9]
so the output is [2,6]
and the Complexity is o(logn)
 */
public class FindTheFIrstAndLastPositionOfElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Welcome to Algorithms Vroo");
        int [] nums = {5,6,7,7,7,7,7,8,8,9,10,11,11,12};
        int target = 7;
//        boolean findTheIndex = false;
//        int finalAns = search(nums,target,findTheIndex);
//        System.out.println(finalAns);
        System.out.println(search(nums,target,true));


    }
   static int [] searchRange(int [] nums,int target,boolean findTheIndex){
        int [] ans = {-1,-1};
        int start = search(nums,target, findTheIndex);
        int end =  search(nums,target, findTheIndex);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
   static int search(int[]nums,int target,boolean findTheIndex){
        int ans = -1;
        int start =0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(findTheIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                return  ans;
            }
        }
        return -1;
    }


}
