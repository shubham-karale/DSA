package BinarySearch;



public class BinarySearchViaRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {2,5,9,12,36,65,86,78};
        int target = 96;
        System.out.println(binarySearchRecursion(nums,0,nums.length-1,target));
    }
    static int binarySearchRecursion(int[] nums,int s,int e,int target)
    {
        //Base Case
        int mid = s+(e-s)/2;
        if(s>e)
        {
            return -1;
        }
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            return binarySearchRecursion(nums,s,mid-1,target);
        }
        else{
            return  binarySearchRecursion(nums,mid+1,e,target);
        }
    }
}
