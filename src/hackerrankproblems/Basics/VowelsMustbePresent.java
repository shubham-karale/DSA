package hackerrankproblems.Basics;
/* Bob's crush's name starts with a vowel.
 That's the reason Bob loves vowels too much. He calls a string "lovely string"
  if it contains either all the lowercase vowels or all the uppercase vowels or both,
  else he calls that string "ugly string".
For more clarification, see the sample testcase explanation.*/
import java.util.Scanner;

public class VowelsMustbePresent {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        int j = 0;
        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            if ( ch == 'a'||ch == 'e'|| ch == 'i'|| ch=='o'||ch=='u'||ch == 'A'||ch == 'E'|| ch == 'I'|| ch=='O'||ch=='U' ) {

                System.out.println("Lovely Strings");
            }
            else{
                System.out.println("Ugly Strings");
            }

            }

    }
}
