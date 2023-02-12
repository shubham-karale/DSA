/*
Output:
1) Read an Integer Using Scannner Classes
2) if x value is odd, display "Hello"
3) if  x is even and x is between 0 to 10 display "Hi"
       10 to 20 display "Hello"
       >20 display "Bye"
 */
package hackerrankproblems.Basics;

import java.util.Scanner;

public class IfElseChallenge3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Welcome to the Core Java Challenges By Naresh Technologies");
        System.out.println("Enter the value of x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2!=0){
            System.out.println("Hello(It's Odd Number Vro)");}
        else{
            if(x>=0&&x<=10){
                System.out.println("Hi(Even Number With Value between 0 to 10)");
            }
            else if(x>10&&x<=20){
                System.out.println("Hello(Even with the value 10 to 20");

            }
            else{
                System.out.println("Bye(x is greater than 20)");

            }
        }
    }
}
