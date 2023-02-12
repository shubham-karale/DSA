package com.company.ArraysQuestions.AlgorithsmQuestions;
/*
Qu 1) Find the Smallest letter greater than target.
Given an char array letters is sorted according to ascending order
return the smallest character in the array that is greater than target
Input:- letter = {'c,'d,'e','h};
target = a;
output = c
 */
public class AlgorithmsQU1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        char [] arr = {'c','d','f','h','l','n','p','s','z'};
        char target ='e';
       char finalAns = sLGTTarget(arr,target);
        System.out.println(finalAns);
    }
    public static char sLGTTarget(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(target

                    <letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return letters[start % letters.length];


    }
}
