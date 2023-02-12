package ArrayQuestions;

public class FindAllIndex {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int[] nums = {2,3,6,9,8,3,2,3,7,4};
        int target = 3;
        int count = 0;
        System.out.println(allindex(nums,0,target,count));
    }
    static int allindex(int [] nums,int idx,int target,int count){
        if(idx== nums.length){
            return -1;
        }
        if(nums[idx]==target){
            count++;
            return idx;
        }
        return allindex(nums,idx+1,target,count+1);
    }
}
