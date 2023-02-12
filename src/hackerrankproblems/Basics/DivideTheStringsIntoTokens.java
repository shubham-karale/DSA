package hackerrankproblems.Basics;
/* String Tokenizer Concepts*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class DivideTheStringsIntoTokens {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);//Take Input Strings
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " !,?._'@"); // String Tokenizer Object Initialization
        System.out.println("Count: "+st.countTokens()); // count the Number of tokens
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // Move Towards next tokens
        }
    }
}
