package LeetCode.Arrays;

public class SumofArrayElemViaRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        int [] arr  = {1,2,3,4,5};
        System.out.println(sumofArray(arr,0));
    }
    static int sumofArray(int [] arr,int sum)
    {

      for (int i = 0; i < arr.length; i++) {
          sum= sum+arr[i];
      }
      return sum;

    }
}
