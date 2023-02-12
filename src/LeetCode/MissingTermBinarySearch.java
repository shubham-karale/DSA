package LeetCode;

public class MissingTermBinarySearch {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int [] arr = {4,7,9,10};
        int n = arr.length;
        System.out.println(missingTerm(arr,n));
    }
    static int missingTerm(int[] arr,int n){
        int start = 0;
       // int n = arr.length;
        int end = arr.length-1;
        int d = (arr[n - 1] - arr[0]) / n;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid+1]-arr[mid]!=d){
               return arr[mid]+d;
            }
            else if(mid>0 && arr[mid]-arr[mid-1]!=d){
                return arr[mid-1]+d;
            }
            // If above test cases failed, then search left side of the array
            // Tn = a+(n-1)d =  arithmatic Progression Series
            // (n-1) = mid
            else if(arr[mid]==arr[0]+mid*d){
                start = mid+1;
            }
            // If left side is in AP The check the right side
            else{
                start = mid+1;
            }
        }
        // If Above test Cases is failed the search at the right side
        return -1;
    }
}
