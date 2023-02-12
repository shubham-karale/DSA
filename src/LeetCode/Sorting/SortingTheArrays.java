package LeetCode.Sorting;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortingTheArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {5,1,1,2,0,0};
       System.out.println(Arrays.toString(nums));
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;


    }
}
