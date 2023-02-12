package LinkedList;

public class SinglyLinkedListTheory {

    //Create the class Node and create the variables of data and next
    class Node {
        int data;
        Node next;
// Create the constructor to take the data and next
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Create the head and tail of the linkedlist
      public  Node head = null;
       public Node tail = null;
 // Create the Methods to add the new Node
    public void addNode(int data)
    {
        //Create the New Node and check the the the list is empty or not if list is empty
        //then the assign NewNode to the head and tail of the linkedlist
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        // else the assign New Node to the tail.next and tail
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display()
    {
        //Create the temporary node to iterate the list
        Node curr = head;
        if(head==null)
        {
            System.out.println("The List is Emplty");
            return;
        }
        System.out.println("These is the starting of the SinhglyLinkedList");
        while(curr != null)
        {
            System.out.print(curr.
                    data+"->");
            curr = curr.next;
        }
        System.out.println("");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Love");
        SinglyLinkedListTheory sllt = new SinglyLinkedListTheory();
        sllt.addNode(1);
        sllt.addNode(2);
        sllt.addNode(3);
        sllt.addNode(4);
        sllt.addNode(5);
        sllt.display();
    }
}
