package com.company.Algorithms.BinarySearch;

public class FindTheElemInRotatedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int[] nums = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 7;
        System.out.println(searchInRotatedArray(nums, target, 0, nums.length - 1));
    }

    static int searchInRotatedArray(int[] nums, int target, int s, int e) {
        // If Start is greater than end that means array is not rotated
        if (s > e) {
            return -1;
        }
        // Find the middle element
        int m = s + (e - s) / 2;

        // If mid ele is target means return mid
        if (nums[m] == target) {
            return m;
        }
        // Check that the mid ele should be greater than start ele
        if (nums[s] <= nums[m]) {
            // check that ele lies in start to mid or not
            if (target >= nums[s] && target <= nums[m]) {
                // if yes then shift to the left part of array
                return searchInRotatedArray(nums, target, s, m - 1);
            } else {
                // if not shift to the right part of the array
                return searchInRotatedArray(nums, target, m + 1, e);
            }
        }
        // If Ele is greater than mid and less than e so move the array to right part of the array
            if (target >= nums[m] && target <= nums[e]) {
                return searchInRotatedArray(nums, target, m + 1, e);
            }

            return searchInRotatedArray(nums, target, s, m - 1);


        }
    }


    

