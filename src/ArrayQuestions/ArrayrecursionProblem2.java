package ArrayQuestions;

public class ArrayrecursionProblem2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {45,85,65,95,33,49,89,98,41,23};
        System.out.println(elePrsesntOrNot(arr,0,42));
    }
    static boolean elePrsesntOrNot(int [] arr,int index,int target){
        //Base Condition
        if(index== arr.length-1){
            return false;
        }
        return arr[index]==target || elePrsesntOrNot(arr,index+1,target);
    }
}
