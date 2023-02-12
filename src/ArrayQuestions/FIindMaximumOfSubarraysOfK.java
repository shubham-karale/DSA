package ArrayQuestions;
import java.util.*;
public class FIindMaximumOfSubarraysOfK {
    public static void main(String[] args) {
        System.out.println("Enter Java Program");
        System.out.println("Enter the lenght of Arrays");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the Value of K");
        int k = sc.nextInt();
        System.out.println("Enter the elements");
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxiOfSubArrays(arr,n,k));


    }
    static List<Integer> maxiOfSubArrays(int [] nums,int n,int k)
    {
        ArrayList<Integer> ans  = new ArrayList<Integer>();
        int maxi = Integer.MIN_VALUE;
        for (int i = 0;i<n-k;i++)
        {
            for(int j = i;j<i+k-1;j++)
            {
                maxi = Math.max(nums[j],maxi);

            }
            ans.add(maxi);
        }
        return ans;
    }
}
