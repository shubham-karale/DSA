package LeetCode.Sorting;

import java.util.Arrays;

/*
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
public class SquaresofaSortedArray977 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] nums = {-7,-3,2,3,11};
        System.out.println(sortedSquares(nums));

    }
    public static int[] sortedSquares(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;


    }
}

