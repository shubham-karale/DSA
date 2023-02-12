package Recursion;

public class facto {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        //System.out.println(factorial(0));
        int facto = 1;
        for (int i = 1; i <=5 ; i++) {
            facto = facto*i;
        }
        System.out.println(facto);

    }
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
