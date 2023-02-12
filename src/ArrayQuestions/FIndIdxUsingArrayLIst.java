package ArrayQuestions;

import java.util.ArrayList;

public class FIndIdxUsingArrayLIst {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {1,2,4,6,8,4,2,6,7,4};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
    //    System.out.println(findIndices(nums,target,0,new ArrayList<>()));
        System.out.println(findIndices(nums,target,0,list));

    }
    static ArrayList<Integer> findIndices(int[] nums,int target,int idx,ArrayList<Integer> list){
        //Base Condition
        if(idx== nums.length){
            return list;
        }
        if(nums[idx]==target){
            list.add(idx);
        }
        return findIndices(nums,target,idx+1,list);
    }

}
