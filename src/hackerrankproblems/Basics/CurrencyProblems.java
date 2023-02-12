package hackerrankproblems.Basics;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyProblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        String s=Double.toString(payment);
        try{
           NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
           String us = formatter.format(payment);


            // get and print the symbol of the currency
            NumberFormat formatter1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

            String india = formatter.format(payment);

            NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = formatter2.format(payment);
            NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france = formatter3.format(payment);


            // Write your code here.


            System.out.println("US: " + us+s);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }

    }
}

