package hackerrankproblems.Basics;
import java.util.*;
public class ToReverseTheStrings {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String S1 = "xhevcuyc";
        String S2 = "cvnerivbh";
        String p = S1 + S2;
        System.out.println(p);


        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(p);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);

    }
    }

