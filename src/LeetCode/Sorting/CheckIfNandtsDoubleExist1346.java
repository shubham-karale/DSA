package LeetCode.Sorting;

import java.util.*;

/*
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
Example 3:

Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.
 */
public class CheckIfNandtsDoubleExist1346 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
       // int [] nums = {3,1,7,11};
        int [] nums = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(nums));
        System.out.println(checkExistsorNot(nums));

    }
    public static boolean checkIfExist(int[] nums) {
        Arrays.sort(nums);
      Set finalSet  = new HashSet();
        for (int i = 0; i < nums.length ; i++) {
            finalSet.add(2*nums[i]);
        }
        for (int i = 0; i <nums.length ; i++) {
            if(finalSet.contains(nums[i])){
                return true;
            }
        }
        return false;
}
static boolean checkExistsorNot(int[] nums){
        // Creating map
    Map<Double,Integer> map =  new HashMap<>();
    //Run the loop
    for (int i = 0; i < nums.length ; i++) {
        //check whether the number and its double exist or Not also check that half of number is
        // present or not
        if(map.containsKey((double) nums[i]*2)|| map.containsKey((double) nums[i]/2)){
            return true;

        }
        // Add element to the map
        map.put((double)nums[i],1);
    }
    return false;
}

}
