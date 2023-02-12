package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1.
List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]
 */
public class MinimumAbsoluteDifference1200 {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {4,2,1,3};
        System.out.println(minimumAbsDifference(nums));

    }
    public static ArrayList<List<Integer>> minimumAbsDifference(int[] nums)
    {
        ArrayList<List<Integer>> res = new ArrayList<>(2);

        Arrays.sort(nums);
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]-nums[i]<d)
            {
                d = nums[i+1] - nums[i];
            }
        }
        for (int i = 0; i < nums.length-1; ++i) {
            if(nums[i+1]-nums[i]==d)
            {
                List<Integer> pair = new ArrayList<>(2);
                pair.add(nums[i]);
                pair.add(nums[i+1]);
                res.add(pair);


            }
        }
        return res;


    }

}
