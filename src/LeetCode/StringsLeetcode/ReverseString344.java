package LeetCode.StringsLeetcode;

public class ReverseString344 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        // s = ["h","e","l","l","o"]
        char [] s = {'h','e','l','l','0'};
        //System.out.println(reverseString(s));

    }
    public static void reverseString(char[] s) {
       int start = 0;
       int end  =s.length;
       while (start<=end)
       {
           char temp = s[end];
           s[end] = s[start];
           s[start] = temp;
           start++;
           end--;
       }

    }

    private static void swap(char[] c,int first,int second) {
        int temp = c[first];
        c[first] = c[second];
        c[second] = (char) temp;
    }
}
