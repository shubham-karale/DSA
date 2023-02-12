package TestingProblems;


import java.util.Scanner;

public class Qu3{
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the Number");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int reverse = 0;
        while (num!=0){
            int rem = num%10;
            reverse = reverse*10+rem;
            num = num/10;


        }
        System.out.println(reverse);
    }

}
