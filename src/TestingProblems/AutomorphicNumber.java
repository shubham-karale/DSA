package TestingProblems;

import java.io.InputStream;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        InputStream src;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        automorphic(num);

    }
    static void automorphic(int num){
        int count=  0;
        int sqaureNum = num*num;
        int rev = 0;
        int temp = num;
         rev = sqaureNum%100;


        if(rev==num){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not a Automorphic Number");
        }
    }
}
