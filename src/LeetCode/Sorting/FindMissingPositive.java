package LeetCode.Sorting;

import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        int  i = 0;
        int ans = 0;
        while (i<nums.length){
            int correctidx = nums[i]-1;
            if(nums[i]!=nums[correctidx]){
                swap(nums,i,correctidx);
            }
            else{
                i++;
            }

    }
        for (int j = 0; j < nums.length ; j++) {
            if(nums[j]!=j+1){
                ans = j+1;
            }
        }
        return ans;
}

    private static void swap(int[] nums, int fi, int se) {
        int temp = nums[fi];
        nums[fi] = nums[se];
        nums[se] = temp;
    }
}
