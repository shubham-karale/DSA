package LeetCode.Sorting;

import java.util.*;

public class Leet1385HowManyNumbersSmallerThan {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumber(nums)));

    }
    static int [] smallerNumber(int [] nums){
        Map<Integer,Integer> map = new TreeMap<>();
        for (int num:nums
             ) {
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int smallNum = 0;
        for (int num: map.keySet()
             ) {
            int temp = map.get(num);
            map.put(num,smallNum);
            smallNum = smallNum+temp;

        }
        for (int i = 0; i <nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
