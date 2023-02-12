package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.List;

/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
public class IntersectionofTwoArrays349 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(intersection(nums1, nums2));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if(!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }
                }
            }


        }
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            nums[i] = (int) list.get(i);
        }
        return nums;
    }
}
