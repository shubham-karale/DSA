package LinkedList;

import java.util.LinkedList;

public class ReverseLinkedListOfNSize {
    public static void main(String[] args) {
        System.out.println("Welcome to java Love");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(reverseLinkedList(list));


    }
    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list)
    {
        LinkedList<Integer> l = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >=0 ; i--) {
            l.add(list.get(i));
        }
        return l;
    }
}
