package ArrayQuestions;
/*
Find an Array is Sorted Or Not
 */
public class ArrayRecursionProblem1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!");
        int [] arr = {2,5,6,8,9,12,35,65,85,945};
        System.out.println(sortItOrNot(arr,0));
    }
    static boolean sortItOrNot(int[] arr,int index){
        //Base Condition
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortItOrNot(arr,index+1);
    }
}
