package hackerrankproblems.Basics;

public class Methods1 {
    static int CompareTo1(int a1,int b1,int c1){
        if (a1 > b1 && a1>c1) {
            return a1;

        }
        else if( b1>a1 && b1>c1){
            return b1;
        }
        else {
            return c1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");

        System.out.println( CompareTo1(25,89,65));
    }
}
