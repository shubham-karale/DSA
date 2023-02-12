package hackerrankproblems.Basics;

import java.util.Scanner;

public class StringsProblems2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Pro Java Love");
        Scanner sc1  = new Scanner(System.in);
        String A  = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        String B  = sc1.next();
        int a = A.length()+B.length();
        System.out.println(a);

        int c = A.compareTo(B);
        boolean b;
        if(c>0){
            b = true;
            System.out.println("Yes");
        }
        else{
            b = false;
            System.out.println("No");
        }

        String output = A.substring(0, 1).toUpperCase() + A.substring(1)+" " + B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(output); // These is Procedure for the Make the Initial Letters in Upper case
    }
}
