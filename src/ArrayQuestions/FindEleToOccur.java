package ArrayQuestions;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class FindEleToOccur {
    public static void main(String[] args) {
        System.out.println("Enter the Value of N");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Specific Count");
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//        for (int i = 0; i < n;i++)
//        {
//            System.out.print(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(firstOccurEle(arr,k));
    }

    private static int firstOccurEle(int[] arr,int k) {
        //Syntax Of HashMap
      HashMap<Integer,Integer> mp = new HashMap<Integer, Integer>();
        for(int it:arr)
        {
            // if the ele are already present then the just increment the count
            if(mp.containsKey(it))
            {
                mp.put(it,mp.get(it)+1);
                // if if reaches k times then just return the iterator
                if(mp.get(it)==k)
                {
                    return it;
                }
            }
            // If the elements are not present then just put the elemets in HashMap
            // If the all the elements are count is 'k' then just the return the all the elements
            else {
                mp.put(it,1);
                if(mp.get(it) == k)
                {
                    return it;
                }
            }
        }
        return -1;

        
    }
}
