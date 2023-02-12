package ArrayQuestions;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class barPrint {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Enter the Value of N");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        barPrint(arr,n);
    }
    static void barPrint(int [] arr,int n)
    {
       int max = arr[0];
       // find max Floor
       for(int i = 1;i<n;i++)
       {
           max = Math.max(max,arr[i]);
       }
       // Print the Floor tower
        for(int floor = max;floor>=1;floor--)
        {
            // print the Buildings
            for(int i = 0;i<n;i++)
            {
                if(arr[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println(" ");
        }

    }
}
