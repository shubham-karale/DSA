package LinkedList;

public class LL {
    //Create the head and tail Of LL
    private Node head;
    private Node tail;
    //Create the Clss Node with containing the data and next pointer
    private class Node{
        private int data;
        private Node next;
 // Create the Required Contsructors
        public Node(int data) {
            this.data = data;
        }
//   Create the constructors for for data and next pointers
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
    // Insert From front side of the LL
    // 1) Create the Node first
    // 2) Next Assign node.next as head
    // 3) assign head as new Node
    // 4) if tail is null that means it is tail==head;
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }
    /*
     1) To Display the list
     2) First create the dummy Node and run loop till the temp.next is not equal to null
     3) increment the temp pointer and print the list
     */
        public void displayList()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+"->"+" ");
                temp = temp.next;
            }
            System.out.println("END");

        }
        public void insertLast(int val)
        {
            // Corner Case
            if(tail == null) {
                insertFirst(val);
            }
            Node node  = new Node(val);
            tail.next = node;
            tail = node;

        }
        public void insertAtAnyPosition(int val,int idx)
        {
            // Corner Case 1
            if(idx == 0)
            {
                insertFirst(val);
                return;
            }
            // Corner Case 2
//            if(idx == size)
//            {
//                insertLast(val);
//            }
            Node temp = head;
            for (int i = 1; i < idx ; i++) {
                temp = temp.next;
            }
            Node node = new Node(val,temp.next);
            temp.next = node;

        }




    public static void main(String[] args) {
        System.out.println("Welcome to the World of Tech");
        LL l1 = new LL();
        l1.insertFirst(18);
        l1.insertFirst(5);
        l1.insertFirst(7);
        l1.insertFirst(98);
        l1.insertFirst(56);
        l1.displayList();
        l1.insertLast(10);
        l1.insertLast(6);
        l1.insertLast(55);
        l1.displayList();
        l1.insertAtAnyPosition(100,3);
        l1.displayList();

    }
}
