package LeetCode.Sorting;

import java.util.Arrays;

public class ContainDuplicateII219 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] nums =  {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>k){
                return false;
            }

        }
        return true;
    }
}
