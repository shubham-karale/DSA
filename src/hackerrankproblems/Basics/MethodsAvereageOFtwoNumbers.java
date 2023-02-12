package hackerrankproblems.Basics;

import java.util.Scanner;

/*
 Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */
public class MethodsAvereageOFtwoNumbers {
    public static int Avg1(int a1,int b1){
        int avg = a1+b1;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Input 1st Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input 2nd Number: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("The Average of two Numbers is :"+Avg1(a,b));



    }
}
