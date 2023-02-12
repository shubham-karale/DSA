package hackerrankproblems.Basics;
/* Check the Strings is Palindrome OR Not and maximum entered Character is 50       */
import java.util.Scanner;

public class PalindromeNumberInStrings {
    public static void main(String[] args) {
        System.out.println("Welcome to Java World");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if (s1.length()<50) {   // Limit the Enter character


            StringBuilder sb = new StringBuilder(); // stringBuilder for reversing the Strings
            sb.append(s1);
            String s2 = sb.reverse().toString(); //reverse the string and convert to again string
            System.out.println(s2);
            if (s1.equals(s2)) {   // Check the Strings are same or Not
                System.out.println("Palindrome Number");

            } else {
                System.out.println("These is not a palindrome case");
            }
        }
    }
}
