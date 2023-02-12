package LeetCode.Sorting;

import java.util.Arrays;

public class SortArrayByParity905 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {3,1,2,4};
//        System.out.println(sortArrayByParity(arr));
        System.out.println(Arrays.toString(arr));

    }
    static int [] sortArrayByParity(int [] arr)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start < end) {
            if(arr[start]% 2==1)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }
            else{
                start++;
                //end--;
            }
        }
        return arr;
    }
}
