package LeetCode;

import java.util.Scanner;

public class SqaureRoot {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(squareRoot1(num));
        System.out.println(squareRoot2(num));


    }
    static int squareRoot1(int num){
        return (int) Math.sqrt(num);
    }
    static int squareRoot2(int num){
        int start = 0;
        int end = num;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid>(num/mid)){
                end = mid-1;
            }
            else if(mid<(num/mid)){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
