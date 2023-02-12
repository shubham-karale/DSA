package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java ");
       int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++)

         {
            if(nums[i]==nums[i+1] && i+1<= nums.length){
                return true;
            }
            
        }
        return false;
}
}
