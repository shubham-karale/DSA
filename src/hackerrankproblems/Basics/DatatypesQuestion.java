package hackerrankproblems.Basics;

import java.util.Scanner;

public class DatatypesQuestion {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        Scanner scanner = new Scanner(System.in);
        long a  = scanner.nextLong();
        for(long i=0;i<a;i++){
            System.out.println(a+" can be fitted in:");
            if(a>=-128 && a<=127){System.out.println("* byte"); break;}

                //Complete the code
            if(a>=-32768 && a<= 32767){
                System.out.println("* short");
            }

            if(a>=-2147483648 && a<= 2147483647){
                System.out.println("* int");


            }
           else{
                System.out.println("* long");
            }

        }
    }
}
