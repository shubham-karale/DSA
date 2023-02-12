package LeetCode.Sorting;

import java.util.Arrays;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] nums = {3,1,3,4,2};
        System.out.println(duplicateNumber(nums));
    }
    static int duplicateNumber(int[] nums){
        int ans = -1;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=i+1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
