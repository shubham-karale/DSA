package ArrayQuestions;
/*
Find the first index occurence of the target element
in an array
input = {2,3,6,3,9,8,3,2,6,24};
target = 3
output = 1{index}
 */
public class FindIndexFirstOccurenceInArray {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] nums = {2,3,6,3,9,8,3,2,6,24};
        int target = 6;
        System.out.println(findIndex(nums,0,target));
        System.out.println(findIndexViaBacktracking(nums,0,target));
    }
    static int findIndex(int [] nums,int idx,int target){
        //Base Condition
        if(idx== nums.length){
            return -1;
        }
        // if we get the target then  return the idx
        if(nums[idx]==target){
            return idx;
        }
        //if we don't get the index then increment the index of the arrays
       return findIndex(nums,idx+1,target);
    }
    static int findIndexViaBacktracking(int[] arr,int idx,int target){
        //Base Condition
        if(idx== arr.length){
            return -1;
        }
        int fisa = findIndexViaBacktracking(arr,idx+1,target);
        if(arr[idx]==target){
            return idx;
        }
        else{
            return fisa;
        }
    }

}
