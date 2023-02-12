package com.company.Algorithms.BinarySearch;

public class FindPivotEle {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        int [] arr = {3,8,10,17,1};
        int n = arr.length;
        System.out.println(getPivotElement(arr,n));
    }
    static int getPivotElement(int[] arr,int n){
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return s;
    }
}
