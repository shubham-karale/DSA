package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class IsSubsetOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Value Of n");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the Value of n");
        int n = sc.nextInt();
        int [] A = new int[m];
        int [] B = new int[n];
        for (int i = 0; i < m ; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            B[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
    static boolean checkSubset(int [] A,int [] B,int m, int n)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        boolean ans = false;
        int min = Math.min(m,n);
        for (int i = 0; i < min; i++) {
            if(A[i]!=B[i])
            {
                ans = false;
            }
            else {
                ans = true;
            }
        }
        return ans;
    }
}
