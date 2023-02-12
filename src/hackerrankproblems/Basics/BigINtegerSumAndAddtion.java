package hackerrankproblems.Basics;
/*
In this problem, you have to add and multiply huge numbers!
 These numbers are so big that you can't contain them in any ordinary data types
  like a long integer.
  Use the power of Java's BigInteger class and solve this problem.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class BigINtegerSumAndAddtion {
    public static void main(String[] args) {
//        System.out.println("Welcome to Java Love");
//        Scanner sc = new Scanner(System.in); // Take input characters from User
//        BigInteger a1 = new BigInteger(sc.next()); // Create a Big Integer a
//        BigInteger b1 = new BigInteger(sc.next());// Create a Big Integer b
//        BigInteger c,d;
//        c = a1.add(b1); // Adds a and b
//        d = a1.multiply(b1); // MMultiply a and b
//        System.out.println(c); // prints the output of addition
//        System.out.println(d); // prints the output of Multiplications
        Scanner input = new Scanner(System.in);
        String s1,s2;
        s1=input.nextLine(); // These is the code of the Editorial in  the HackerRank
        s2=input.nextLine();
        input.close();
        System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
        System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
