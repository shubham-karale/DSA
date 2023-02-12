package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FIndTheDifference {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findDifferenceOptimized("abcd","abcde"));
        System.out.println(findDifferenceOptimized1("ae","aea"));
    }
    static char findDifferenceOptimized(String s,String t){
        int i =-1,sum=0;
       while((++i)<s.length()){
           sum = sum+t.charAt(i)-s.charAt(i);
       }
        sum = sum+t.charAt(i);
        return (char) sum;
    }
    static char findTheDifference(String s,String t){
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0; i <s1.length ; i++) {
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[t1.length-1];
    }
    static char findDifferenceOptimized1(String s,String t){
        int i =0,sum=0;
        while(i<s.length()){
            sum = sum+t.charAt(i)-s.charAt(i);
            i++;
        }

        sum = sum+t.charAt(i);
        return (char) sum;
    }
}
