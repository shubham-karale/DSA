package com.company.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurenceOfEachCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love!!!");
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();
        // Map is knwon to Key Value Pair and used to find out occurence
        // In Hashmap Generic clasees is used in angular brackets
        Map<Character, Integer> map = new HashMap<>();
        // Convert the String into char array and stored in arrays
        char [] chars = user_input.toCharArray();
    /*
    Enhanced loop is used for the to run through the characters
    */
        for (char ch:
             chars) {
            // check that characters is present in the map or not if not
            // put the character into the map and assign id
            // if the characters is present in the map then we try to
            // get the key of the character and update that key
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                // count is variable is used to store the the key number
              int count = map.get(ch);
                map.put(ch,count+1);
            }
        }
        System.out.println(map);
    }
}
