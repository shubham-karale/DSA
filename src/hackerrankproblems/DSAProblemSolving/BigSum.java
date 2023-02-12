package hackerrankproblems.DSAProblemSolving;

import java.util.List;

public class BigSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
    }
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long bigSum = 0;
        for (int i = 0; i <ar.toArray().length ; i++) {
            bigSum = bigSum+ar.get(i);
        }
        return bigSum;

    }
}
