package LeetCode.Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
       // int ans = 0;
       // Arrays.sort(nums);

        Arrays.sort(nums);
        int i;

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
                return i;
        }

        return i;
    }
}
