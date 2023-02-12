package LeetCode.Sorting;

import java.util.Arrays;

/*
Sort the Arrays First
Select the last 3 elements after sorting and take the product of that
return that product

 */
public class MaximumProductofThreeNumber628 {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {-100,98,2,6,8,9,5,5};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1] * nums[len-2] * nums[len-3]);
    }
}

