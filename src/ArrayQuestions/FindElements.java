package ArrayQuestions;

import java.util.ArrayList;

// Find the Target Elements
public class FindElements {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] arr = {1,7,3,4,5,6,7,8,7,10};
        int target = 7;
        System.out.println(findElements(arr,0,target));
        System.out.println(findElements1(arr,0,target));
        ElementsList(arr,0,target);
        System.out.println(list);
    }
    static int findElements(int[] arr,int idx,int target){
        if(idx ==arr.length-1){
            return idx;
        }
        if(arr[idx]==target){
            return idx;
        }

        return findElements(arr,idx+1,target);
    }
    static boolean findElements1(int[] arr,int idx,int target){
        if(idx == arr.length-1){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        else{
            return findElements1(arr,idx+1,target);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
   static void ElementsList(int[] arr, int idx, int target){
        if(idx == arr.length){
            return;
        }
        if(arr[idx]==target){
            list.add(idx);
        }
        ElementsList(arr,idx+1,target);
//        System.out.println(list);
    }

}
