package com.company.Algorithms.SieveErtheSences;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println(gcd(65,13));

    }
    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        if(a==0)
        {
            return b;
        }
        while(a!=b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else{
                b= b-a;
            }
        }
        return a;
    }

}
