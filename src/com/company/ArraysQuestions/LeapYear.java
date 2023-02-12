package com.company.ArraysQuestions;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();



            if((year%4==0) && (year%100!=0)|| (year%400==0)){


                System.out.println("The Leap year"+ year);
            }
            else {
                System.out.println("The Not Leap year "+ year);
            }


        }
    }

