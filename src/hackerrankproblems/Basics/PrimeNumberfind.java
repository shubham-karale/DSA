package hackerrankproblems.Basics;

import java.util.Scanner;

/*A single line containing an integer,  (the number to be checked).
//Constraints contains at most  digits.
//Output Format
*/
//If  is a prime number, print prime; otherwise, print not prime.
public class PrimeNumberfind {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int c = Integer.parseInt(n);
        int a = 0;
        if (c < 0) {
            c = c * -1;
        } else if (c == 0) {
            c = 1;
        }
        while (c > 0) {
            c = c / 10;
            a++;


            }
        int d = Integer.parseInt(n);
        System.out.println(a);
        System.out.println(d);
        if (d%2 ==0||d%3==0||d%5==0||d%7==0 ) {
            System.out.println("not prime");

        }
        else {
            System.out.println("prime");
        }


        }
    }

