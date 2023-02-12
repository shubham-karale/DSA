package hackerrankproblems.Basics;

import java.util.Scanner;

/*
Write a Java method to count all vowels in a string. Go to the editor
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
 */
public class MethodsCountTheVowels {
    public static int VowelsCount(String a1) {
        int count = 0; // TO increment the Loops so that we use the count Variable
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) == 'a' || a1.charAt(i) == 'e' || a1.charAt(i) == 'i'  // CharAt is used for the To convert the String into Characters
                    || a1.charAt(i) == 'o' || a1.charAt(i) == 'u') {
                count++; // Imcrement the Loops
            }

        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to java Love");
        System.out.println("Enter the String");
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.nextLine();

        System.out.println(VowelsCount(a));


    }
}
