package LeetCode.Strings;

public class MultiplyStrings43 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java ");
    }
    public static String multiply(String num1, String num2) {
        String finalAns = "";
      int num3 = Integer.parseInt(num1);
      int num4 = Integer.parseInt(num2);
      int ans = num3+num4;
      finalAns = Integer.toString(ans);
      return finalAns;

    }
}
