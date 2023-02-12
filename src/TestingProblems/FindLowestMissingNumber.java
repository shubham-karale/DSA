package TestingProblems;

public class FindLowestMissingNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
       // int [] nums = {0,1,2,6,9,11,15};
        int [] nums = {0,1,2,3,4,5,6,7,8,11};
      //  int [] nums = {1,2,3,4,5,6,7,8,11};
        System.out.println( findLowestMissingNumber(nums));
        System.out.println(findLMissingNumber(nums,0,nums.length-1));
    }
    static int findLowestMissingNumber(int[] nums){
        int res = 0;
        for (int i = 0; i <= nums.length-1 ; i++) {
//            if(nums[i+1]!=nums[i]+1){
//                return i+1;
//               // break;
//            }
            if(nums[i+1]-nums[i]!=1){
                return i+1;
            }
        }
      //  return -1;
        return -1;
    }
    static int findLMissingNumber(int[] nums,int start,int end){
//        int start = 0;
//        int end = nums.length-1;
        if(start>end){
            return end+1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid]==mid){
            return findLMissingNumber(nums,mid+1,end);
        }
        else{
            return findLMissingNumber(nums,start,mid-1);
        }


    }

}