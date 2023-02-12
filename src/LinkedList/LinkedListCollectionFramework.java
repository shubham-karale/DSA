package LinkedList;
import java.util.*;

public class LinkedListCollectionFramework {
    public static void main(String[] args) {
        System.out.println("Welcome");
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        System.out.println(list.size());
        for(int x:list)
        {
            System.out.print(list.get(x) + "->");
        }
        list.removeFirst();
        System.out.println(list.toString());

    }
}
