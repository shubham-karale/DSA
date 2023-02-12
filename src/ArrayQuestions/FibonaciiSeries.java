package ArrayQuestions;

public class FibonaciiSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        System.out.println( fibonacii(6));
    }
    static int fibonacii(int n){
        if(n<2){
            return n;
        }
        return fibonacii(n-1)+fibonacii(n-2);
    }
}
