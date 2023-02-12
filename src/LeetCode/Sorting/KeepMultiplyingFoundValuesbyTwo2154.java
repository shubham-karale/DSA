package LeetCode.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
nums = [5,3,6,1,12], original = 3
Output: 24
Explanation:
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
 */
public class KeepMultiplyingFoundValuesbyTwo2154 {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums,original));
        System.out.println(findFinalOriginal(nums,original));
    }
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]== original){
                original = original*2;
            }

        }

 return original;
    }
    static int findFinalOriginal(int [] nums,int original){
        Set finalOriginal = new HashSet<Integer>();
        for (int i = 0; i < nums.length ; i++) {
            finalOriginal.add(nums[i]);
        }
        while(finalOriginal.contains(original)){
            original = original*2;
        }
        return original;
    }
}
