package TestingProblems;

public class Qu1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr =   {0,1,2,3,9,8,45,65,89,988};
         int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
