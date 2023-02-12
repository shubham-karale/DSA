package LeetCode;

public class MaxAndMinElementsInAnArrays {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        int [] arr  ={110,150,10,60,80,90,45,95};
        MaxElement(arr);

    }
    static void MaxElement(int [] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The Maximum element of the arrays is"+max);
        System.out.println("The Minimum element of the arrays is"+min);

    }


}
