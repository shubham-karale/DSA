package LeetCode;

public class BuyDipSellHigh {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int[] nums = {7,6,4,3,1
        };
        System.out.println(maxProfit(nums));
        System.out.println(maxProfit1(nums));
    }
    static int maxProfit(int [] nums)
    {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int currProfit = 0;
        for (int i = 0; i < nums.length;i++ ) {
            if(nums[i]<lsf)
            {
                lsf = nums[i];
            }
            currProfit= nums[i]-lsf;
            if(op<currProfit)
            {
                op = currProfit;
            }
        }
        return op;
    }
    static int maxProfit1(int [] prices)
    {
        int buy = prices[0];
        int maxpro = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i]-buy;
             buy  =  Math.min(buy,prices[i]);
             maxpro = Math.max(maxpro,diff);
             return maxpro-buy;

        }
        return -1;
    }
}
