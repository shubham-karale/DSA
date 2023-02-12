package hackerrankproblems.Basics;
/*
/*
 Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9
 */


import java.util.Scanner;

public class CountTheNumberOfWords {
    static int CountWords(String S){
        int count=1;
        for (int i = 0; i < S.length(); i++)
            if (S == "")
                count += 1;
        count  = count+1;

       return count;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println("The Number of Words in Input Line "+CountWords(S));
    }
}
