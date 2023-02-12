package ArrayQuestions;

public class print5to1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        printNumeric(6);
    }

    static void printNumeric(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumeric(n - 1);
    }

}
