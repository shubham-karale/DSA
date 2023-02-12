package TestingProblems;
// Find Minimum element in an Array
public class Qu2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr  ={45,89,65,987,36,45,78,654,0,36,-54,89};
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
