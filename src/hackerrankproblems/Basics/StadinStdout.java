package hackerrankproblems.Basics;

import java.util.Scanner;

public class StadinStdout {
    public static void main(String[] args) {
        System.out.println("Welcome to Programming");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Scanner sc1  = new Scanner(System.in);
        double d = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        String s = sc2.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
