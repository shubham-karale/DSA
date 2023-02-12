package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int n;
        System.out.println("Enter The Value Of N");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(missingListNumbers(arr));
    }

    private static List<Integer> missingListNumbers(int [] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Write your code here.
        int mini = arr[0];
        int maxi = arr[0];
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(mini>arr[i])
            {
                mini = arr[i];
            }
            if(maxi<arr[i])
            {
                maxi = arr[i];
            }
        }
        for(int i = mini;i<maxi;i++)
        {
            if(arr[i]!=i)
            {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
