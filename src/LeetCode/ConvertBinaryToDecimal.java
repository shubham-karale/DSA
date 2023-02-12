package LeetCode;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println("Enter the Binary NUmber");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i= 0;
        while(n!=0){
            int d = n % 10;
            if(d==1){
                ans = (int) (ans+Math.pow(2,i));
            }
            n = n/10;
            i++;
        }
        System.out.println(ans);
    }
}
