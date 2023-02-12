package hackerrankproblems.Basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateScheme {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-mm-dd'T'hh:MM:ss");
        String nowStr = sdf.format(now);
        System.out.println("Current Date: " +  nowStr);
    }


}
