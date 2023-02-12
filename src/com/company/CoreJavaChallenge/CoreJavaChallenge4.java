package com.company.CoreJavaChallenge;
/*
1) Extract the Random Number class and print the values between the 100 and 200
2) Random class is  available in Java.util.* package
3) USe these the Random class to generate the random values
    ****TIPS***
    1) Repeat the infinite loops
    2) Generate the random value and check whether the it is in the range of 100 and 200 if yes then count++ and repeat
 */
import java.util.Random;

public class CoreJavaChallenge4 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the random Number");
        // Create the Random Number Objects
        Random r = new Random();
        //Create the count variables to iterate the loops
        int count = 0;
        //Run the while loops to upto you want to Run
        while(count<=20){
            // Take the random values as input
            int x = r.nextInt();
            // check the random number is greater than 100 and less than 200
            if(x>100&&x<=200){
                //Print these Random Number
                System.out.println(x);
                //Iterarate the count variables
                count++;
            }
        }
    }
}
