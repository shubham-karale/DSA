package ArrayQuestions;
import java.util.*;
public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Value of K");
        int k =sc.nextInt();
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxSumSubarray(arr,k,n));

    }
    static int maxSumSubarray(int [] arr,int k,int n)
    {
        //int currSum = 0;
        int idx = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n-k ; i++) {
           int  currSum = 0;
            for(int j = i;j<i+k;j++)
            {
               currSum += arr[j];

            }
//            maxSum = Math.max(currSum,maxSum);
            maxSum = Math.max(maxSum,currSum);


        }
        return maxSum;

    }
}
