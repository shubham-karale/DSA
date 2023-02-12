package LinkedList;

public class LinkedListImplementation {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListImplementation() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        // Insert At First Position 
        /*
        1) check the list is empty or not
        2) Create the new Node
        3) assign Node.next = head\
        4) Assign new node as head
        5) check tail is null or not if it is null then the assingn tail as head
        and increment the size

        */
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    // Display the LinikedList
    public void displayLL()
    {
          Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"->"+" ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAtAnyPosition(int val,int idx)
    {
        if(idx==0)
        {
            insertFirst(val);
            return;
        }
        if(idx==size)
        {
            insertLast(val);
            return;
        }
        //Node node = new Node(val);
        Node temp  = head;
        for(int i = 1;i<size;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }



    public static void main(String[] args) {
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.insertFirst(52);
        ll.insertFirst(38);
        ll.insertFirst(56);
        ll.insertFirst(35);
        ll.insertFirst(69);
        ll.displayLL();
        ll.insertLast(99);
        ll.insertLast(100);
        ll.displayLL();
        ll.insertAtAnyPosition(199,2);
        ll.displayLL();
    }


}


    
    


