package LeetCode.Sorting;

import java.util.*;

/*
You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after.
 The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after.
 The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.
Example 1:

Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation:
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
Example 2:

Input: nums = [2,1]
Output: [2,1]
Explanation:
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array.
 */
public class SortEvenandOddIndicesIndependently2164 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {4,1,2,3};
        System.out.println(sortEvenOdd(nums));
       // System.out.println(evenOddTuto(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortEvenOdd(int[] nums) {
        if (nums.length < 3) {
            return nums;
        }
        // Create the Even and odd arrays to store the elements
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        // Create the ans array to store the final output array formed
        int[] ans = new int[nums.length];

        // Run loop and check the elements is at even positon or at odd positon
        // if even add into the even array and if its odd add into odd array
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
            //Use collections framework
            Collections.sort(even);
            Collections.sort(odd);
            // reverse the odd list for the decreasing order
            Collections.reverse(odd);
            // create the variables to iterate the array index
            int j = 0;
            int k = 0;
            // final ans of the question
            int a = 0;
            int b = 0;
            for (int l = 0; l < nums.length; l++) {
                if (l % 2 == 0)
                    ans[l] = even.get(a++);
                else
                    ans[l] = odd.get(b++);
            }
            return ans;
        }
        //  return ans;

    public static int[] evenOddTuto(int[] nums)
    {
        if(nums.length<3)
         return nums;
         List<Integer> odd=new ArrayList<>();
         List<Integer> even=new ArrayList<>();
         int ans[]=new int[nums.length];
         for(int i=0;i<nums.length;i++)
         {
             if (i%2 == 0)
                 even.add(nums[i]);
                 else
                 odd.add(nums[i]);
             }

         Collections.sort(even);
         Collections.sort(odd);
         Collections.reverse(odd);

         int j=0;
         int k=0;
         for(int i=0;i<nums.length;i++)
         {
              if (i%2 == 0) {
                  ans[i] = even.get(j);
                  j++;
              }
              else {
                  ans[i] = odd.get(k);
                  k++;
              }
         }
         return ans;
    }
}
