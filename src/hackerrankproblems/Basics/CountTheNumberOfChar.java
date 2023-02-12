package hackerrankproblems.Basics;
/*
 Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
 */

import java.util.Scanner;

public class CountTheNumberOfChar {
    public  static int CountTheWords(String str){
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' ')
            {
                count++;
            }
            count = count+1;

        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter your desired Strings");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

         System.out.println("The no of words in the Strings is as follows "+ CountTheWords(str));


    }
}
