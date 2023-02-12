package ArrayQuestions;



public class recursionTheory1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        printNumber(1);
    }
    static void printNumber(int n){
        if (n==6) {
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
