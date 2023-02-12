package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class DisappearedNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

     static void swap(int[] nums, int first, int second) {
        int  temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}



