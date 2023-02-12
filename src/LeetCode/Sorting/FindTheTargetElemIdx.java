package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheTargetElemIdx {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
    static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> idxAdd = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==target){
                idxAdd.add(i);
            }
        }
        return idxAdd;

    }
}
