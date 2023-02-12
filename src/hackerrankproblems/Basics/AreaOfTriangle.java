package hackerrankproblems.Basics;

import java.util.Scanner;

public class AreaOfTriangle {
    static double areaofTriangleCount(int b,int h){
        double area  = (b*h)/2;
        return area;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the value of Breadth");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Enter the value of height");
        Scanner sc3 = new Scanner(System.in);
        int h = sc3.nextInt();
        System.out.println("The area of the Triangle "+  areaofTriangleCount(b,h));
        
    }
}
