public class LinkedList{
    public static class Node{
        int data; 
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //methods
    // add first
    public void firstAdd(int data){
        // step 1: create a new node
        Node newNode = new Node(data);

        // base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
         
        // step 2: newNode next = head
        newNode.next = head;
        // step 3: head = newNode
        head = newNode;
    }

    public static void main(String srgs[]){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.tail = new Node(2);

    }
}