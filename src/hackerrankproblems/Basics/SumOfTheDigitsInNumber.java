package hackerrankproblems.Basics;

import java.util.Scanner;
public class SumOfTheDigitsInNumber {
  static int SumofDigi(int n) {
//
//            String s = String.valueOf(Integer.valueOf(n));
//            char c1 = s.charAt(0);
//            char c2 = s.charAt(1);
//            // int a = c1;
//            //int b = c2;
//
//            int a = Character.getNumericValue(c1);
//            int b = Character.getNumericValue(c2);
//
//            return a + b;
      int result = 0;
      while(n>0){
          result = result + n % 10;
          n = n/10;
      }
      return result;

}



    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if (n < 100) {
//            System.out.println("The Sum of Entered Number : " + SumofDigi(n));
//        }
//        else{
//            System.out.println("Sorry Please Entered Number less than 100");
//        }
        System.out.println("The Sum of Entered Number : " + SumofDigi(n));

    }
}
