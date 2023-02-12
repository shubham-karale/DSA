package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSubarrayofsumK {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("Enter the Value of N");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Value of K");
        int k = sc.nextInt();
        //int [] nums =new int[sc.nextInt()];
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(maxSubarraySum(nums,k));
    }
    static int maxSubarraySum(int [] nums,int k)
    {
      int i = 0,j = 0;
      int sum = 0;
      int mx = 0;
      int n = nums.length;
      // Run loop till the where j should be less than n
      while(j<n)
      {
          // add the ele to sum so that we haven't need to do sum every time
          sum = sum + nums[j];
          // If sum is less than the k value then just increment the J pointer
          if(sum<k)
          {
              j++;
          }
          // if the sum is > k then just remove the elements till the sum <k and incrment the i pointer
          // so the in outer loop icrement the j pointer so that it can slides window
          else if(sum>k)
          {
              while(sum>k)
              {
                  sum -= nums[i];
                  i++;
              }
              j++;
          }
          // if sum = k then jus check j-i+1  > mx then just assign j-i+1  value to max
          else {
              if(j-i+1>mx)
              {
                  mx = Math.max(mx,j-i+1);
              }
          }
      }
        return mx;
    }


}
