package hackerrankproblems.Basics;

import java.util.Scanner;
public class SmallestNumber {
    public static int smallest(int x,int y, int z){
        return Math.min(Math.min(x,y),z); // Uses double Math functions so that we get the Smallest Number
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int y = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int z = sc.nextInt();
        System.out.println("The Smallest Number is "+smallest(x,y,z));
    }
}
