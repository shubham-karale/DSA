package LeetCode.StringsLeetcode;

import java.util.HashSet;
import java.util.Set;

public class PangramOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        String str =  "the quick brown fox jumps over the lazydog";
        System.out.println(checkParagram(str));
    }
    static boolean checkParagram(String str)
    {
        str = str.replaceAll(" ","");

        Set<Character> s1 = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            s1.add(str.charAt(i));
        }
        if(s1.size()==26)
        {
            return true;
        }
        return false;
    }

}
