package hackerrankproblems.Basics;

import java.util.Scanner;

public class IfEleseStatementQuestions {
    public static void main(String[] args) {
        System.out.println("Welcome to Programming");
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>5 && N<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Weird");
        }
    }
}
