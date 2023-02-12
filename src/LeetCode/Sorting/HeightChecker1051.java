package LeetCode.Sorting;

import hackerrankproblems.Basics.AreaOfTriangle;

import java.util.Arrays;

public class HeightChecker1051 {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] heights = {5,1,2,3,4};
     System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int []  expected = Arrays.copyOf(heights, heights.length);
        int count =0;
        Arrays.sort(expected);
        for (int i = 0; i <heights.length ; i++) {
            if(heights[i]!=expected[i]){
                count++;
        }

    }
        return count;
}

}
