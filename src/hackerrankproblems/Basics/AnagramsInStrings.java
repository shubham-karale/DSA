package hackerrankproblems.Basics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;





public class AnagramsInStrings {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        char[] a1 = a.toLowerCase(Locale.ROOT).toCharArray();  // Make the Strings to Char Array
        char[] b1 = b.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(a1);             // Sort the Two Arrays
        Arrays.sort(b1);
        boolean res = Arrays.equals(a1, b1);  // Then Check the Two Arrays Are Same or not
        if (res == true) {
            return true;
        } else {
            return false;
        }
    }

        public static void main(String[] args) {
        System.out.println("Welcome to Programming in Java");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

