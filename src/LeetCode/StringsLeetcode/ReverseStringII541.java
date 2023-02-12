package LeetCode.StringsLeetcode;

public class ReverseStringII541 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
       String  s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
    }

    public static String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();
        int st = k;
        int end = s.length() - 1;
        while (st < end) {
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
        s = ch.toString();
        return s;

    }
}

