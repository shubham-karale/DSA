package TestingProblems;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love !!!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        harshadNumber(num);
    }
    static void harshadNumber(int num){
        int sum = 0;
        int temp = num;
        while (temp!=0){
            int rem = temp % 10;
            sum = sum+rem;
            temp = temp /10;
        }
        if(num%sum==0){
            System.out.println("It's a Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}
