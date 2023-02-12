package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int[] nums = {4,3,2,7,8,2,3,1};
       // System.out.println(findDuplicate(nums));
        System.out.println(cyclicSort(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int findDuplicate(int[] nums) {

        int i = 0;
        while (i<nums.length){
            if(nums[i]!=i+1){
                int crctidx = nums[i]-1;
                if(nums[i]!=nums[crctidx]){
                    swap(nums,i,crctidx);
                }
                else{
                    return nums[i];
                }
            }
            else{
               i++;
            }
    }
        return -1;
}
static void swap(int[] nums,int f,int s){
        int temp = nums[f];
        nums[f]  = nums[s];
        nums[s] = temp;
}
static List<Integer> cyclicSort(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<nums.length){
            int crctidx = nums[i]-1;
            if(nums[i]!=nums[crctidx]){
                swap1(nums,i,crctidx);
            }
            else{
                i++;
            }

        }
    for (int j = 0; j <nums.length ; j++) {
        if(nums[j]!=j+1){
            list.add(nums[j]);
        }
    }
        return list;
}
    static void swap1(int[] nums,int f,int s){
        int temp = nums[f];
        nums[f]  = nums[s];
        nums[s] = temp;
    }

}

