package Recursion;

public class RecursionConcepts2 {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA Java");
        printData(2);
    }
    static void printData(int n){
        // Base Condition
        if(n==0){
            return;
        }
        System.out.println("Pre"+ n);
        printData(n-1);
        System.out.println("In"+ n);
        printData(n-1);
        System.out.println("Post"+ n);
    }
}
