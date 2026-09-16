public class LinkedList {

    private Node head;
    private Node tail; 

    private int size; 


    public LinkedList() {
        this.size = 0; 
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; 
        head = node;

        if (tail == null) {
            tail = head; 
        }

        size++; 
    }    


    public void insertEnd(int val) {
        if (tail == null) {
            insertFirst(val); 
        }
        
        Node node = new Node(val);
        tail.next = node; 
        tail = node; 
        size++; 
    }


    public void insertNth(int val, int index) {
        
        if (index == 0) {insertFirst(val);}
        else if (index == size) {insertEnd(val);}
        Node node = new Node(val);
        int i = 0;
        Node temp = head; 
        while(i != index - 1) {
            temp = temp.next;

        }
        node.next = temp.next; 
        temp.next = node; 
    }

    public int deleteFirst() { 
        int val = head.value;
        head = head.next;
        if (head == null) {head.next = null;
                           tail.next = null;
        }
        size--;
        return val;
    }

    public void display() {
        display(head);
    }
    
    private void display(Node no) {
        if (no == null) {
            return;
        }
        System.out.println(no.value);
        display(no.next + " " );
    }

    private class Node {
        private int value; 
        private Node next; 


        public Node(int value) {
            this.value = value; 
        }


        public Node (int value, Node next) {
            this.value = value; 
            this.next = next;
        }
    }

}