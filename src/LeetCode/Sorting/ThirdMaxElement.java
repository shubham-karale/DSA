package LeetCode.Sorting;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaxElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] nums = {2,2,3,1};
        System.out.println(thirdMaxElement(nums));
    }
    static int thirdMaxElement(int [] nums){
        //Create a Set to track the third Largest Element
        Set<Integer> thirdMax = new HashSet<>();
        // Add the Element into the set using a loops
        //if the element count in the set is greater than 3 then remove least element
        for (int num:nums
             ) {
            thirdMax.add(num);
            if(thirdMax.size()>3){
                //removing least element
                thirdMax.remove(Collections.min(thirdMax));
            }


        }
        // if the size of set is 3 at end then return the min element in the set
        if(thirdMax.size()==3){
            return Collections.min(thirdMax);
        }
        // else return the greatest element in the array
        return Collections.max(thirdMax);
    }
}
