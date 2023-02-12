package TestingProblems;

import java.util.Arrays;

public class INbuiltBS {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr  = {5,4,3,2,1};
        int target = 3;
        System.out.println(Arrays.binarySearch(arr, target));
    }
}
