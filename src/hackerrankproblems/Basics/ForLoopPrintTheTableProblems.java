package hackerrankproblems.Basics;

import java.util.Scanner;

public class ForLoopPrintTheTableProblems {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming Love");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println(N +"X"+i+"="+(N*i));
        }
    }
}
