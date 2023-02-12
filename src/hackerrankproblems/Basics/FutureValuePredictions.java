package hackerrankproblems.Basics;

import java.util.Scanner;

public class FutureValuePredictions {
    static double futureValuePrediction(double principalAmount,float interestRate,int time) {
        int n = 12;
        double finalAmount = 0;
        for (int i = 0; i < time; i++) {
            finalAmount = principalAmount * Math.pow((1 + (interestRate / n)), n * time);
        }



        return finalAmount;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the value of Principal amount(P)");
        Scanner sc1 = new Scanner(System.in);
        double principalAmount = sc1.nextDouble();
        System.out.println("Enter the value of interst rate(r)");
        Scanner sc2 = new Scanner(System.in);
        float interstRate = sc2.nextFloat();
        System.out.println("Enter the Time of Horizon for your Investment (T)");
        Scanner sc3 = new Scanner(System.in);
        int timeOfHorizon = sc3.nextInt();

        System.out.println(futureValuePrediction(principalAmount,interstRate,timeOfHorizon));


    }
}
