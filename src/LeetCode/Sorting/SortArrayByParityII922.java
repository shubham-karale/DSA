package LeetCode.Sorting;

import java.util.Arrays;

public class SortArrayByParityII922 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {4,2,5,7};
//        System.out.println(sortArrayByParityII(nums));
//        System.out.println(Arrays.toString(nums));
       sortArrayByParityIIOptimised(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int[] sortArrayByParityII(int[] nums) {
      int [] res = new int[nums.length];
      int evenIdx = 0;
      int oddIdx = 1;
      int l = nums.length;
      while (evenIdx < l && oddIdx < l){
          if(nums[evenIdx] % 2 == 0){
              evenIdx = evenIdx+2;
          }
          else if(nums[oddIdx] % 2==0){
              int temp = nums[evenIdx];
              nums[evenIdx] = nums[oddIdx];
              nums[oddIdx] = temp;
              evenIdx = evenIdx+2;
              oddIdx = oddIdx+2;
          }
          else{
              oddIdx = oddIdx+2;
          }
      }
      return nums;
    }
    public static int[] sortArrayByParityIIOptimised(int[] nums)
    {
        int[] arr = new int[nums.length];

        int even = 0; // Keeps track of even values
        int odd = 1;  //Keeps track of odd values

        for(int i = 0; i < nums.length; i++){  //going through entire array O(n)

            if(nums[i] % 2 == 0){     //if even
                arr[even] = nums[i];   // store in even indices of new array
                even += 2;   //increment by 2 , keep up w/ even indices
            }

            else {

                arr[odd] = nums[i]; // if odd...
                odd += 2;   //  ...
            }
        }

        return arr;
    }

}
