package Strings;
/*
ans = ch+ans // Add to the front side of the string
ans = ans+ch //Add to the end side of the string
 */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseString(str));
        System.out.println(reverseStringUsingStringBuilder(str));

    }
    static String reverseString(String str)
    {
        String ans = "";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            ans = ch+ans;
        }
        return ans;

    }
    static String reverseStringUsingStringBuilder(String str)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        //builder.reverse();
       String ans = builder.reverse().toString();
       return ans;
    }
}
