// filepath: c:\Users\vishw\OneDrive\Desktop\Data Structures and Algorthems\17-Linked List\lecture\linkedlist\LinkedList.java

public class LinkedList{
    public static class Node{       // NODE CLASS
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
    public void firstAdd(int data){     // ADDFIRST()
        // step 1: create a new node
        Node newNode = new Node(data);

        // If linked list has no node
        if (head == null) {
            head = tail = newNode;
            return;
        }
         
        // If linked has any node.
        newNode.next = head;
        // step 3: head = newNode
        head = newNode;
    }

    public static void addLast(int data){   // ADDLAST()
        Node newNode = new Node(data);

        // If there is no node in the linkedList
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void add(int index, int data){    // ADD()
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public static int size(){   // SIZE()
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        return size;
    }

    public static int remove(int index){    // REMOVE()
        if (head == null) {
            return 0;
        }
        Node curr = head;
        int i = 0;
        while (i < index-1) {
            curr = curr.next;
            i++;
        }
        int data = curr.next.data;
        curr.next = curr.next.next;
        return data;
    }

    public static int IteratorSearch(int key){  // SEARCH ITERATION
        if (head == null) {
            System.out.println("Your linked list is Empty.");
            return -1;
        }
        int index = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    public static int recursiveSreach(int key) {    //RECURSIVE SEARCH
        return rec(head, key);
    }

    public static int rec(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = rec(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public static void reverse(){   // REVERSE
        if (head == null) {
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
        
    public static void removeFromLastNth(int n){   // REMOVE FROM LAST Nth NODE
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        System.out.println("size = " + size);
        System.out.println("n = " + n);
        
        if (n == size) { // It is nth From the last.
            head = head.next;
        }
        
        int index = size + 1 - n; // from the first. // 7
        System.out.println("index = " + index);
        int i = 1;
        temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        System.out.println("Deleted data = " + temp.next.data);
        temp.next = temp.next.next;
    }

    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    
    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;

        // Step 1: Detect the cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }

        // If no cycle is detected, return
        if (fast == null || fast.next == null) { 
            System.out.println("No cycle is found...");            
            return;
        }

        // Step 2: Find the start of the cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast; // Update `prev` to the current `fast`
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break the cycle
        prev.next = null;
    }
    
    
    public static void main(String srgs[]){     // MAIN FUNCTION
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = head;
        removeCycle(head);
        System.out.println(detectCycle(head));

        
    }
}