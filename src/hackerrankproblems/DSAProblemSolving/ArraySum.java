package hackerrankproblems.DSAProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(simpleArraySum(list));



    }
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i <ar.toArray().length ; i++) {
            sum = sum+ ar.get(i);
        }
        return sum;

    }

}
