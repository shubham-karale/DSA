package LeetCode;

public class MaxAndMinElementUsingMathFunctio {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        int [] arr = {60,150,180,190,20,80,875,355};
        MaxAndMinElement(arr);

    }
    static void MaxAndMinElement(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("The Max element is "+max);
        System.out.println("The min element is "+ min);
    }
}
