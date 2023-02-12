package LinkedList;
import java.util.*;
import java.util.LinkedList;

public class LinkedListTesting {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.addLast(60);
        list.addLast(78);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
      list.removeFirst();

    }
}
