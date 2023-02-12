package ArrayQuestions;

public class recursionTheory {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        printNumber(1);
    }
    static void printNumber(int n){
        System.out.println(n);
        printNumber2(2);
    }

     static void printNumber2(int n) {
        System.out.println(2);
        printNumber3(3);
    }

     static void printNumber3(int n) {
        System.out.println(3);
        printNumber4(4);
    }

     static void printNumber4(int n) {
        System.out.println(4);
        printNumber5(5);
    }

     static void printNumber5(int n) {
        System.out.println(5);
    }

}
