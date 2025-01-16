import java.util.*;
public class ClassDeque {

    // Deque :- Double ended queue.
    // addFirst()
    // addLast()
    // removeFirst()
    // removeLast()
    // getFirst()
    // getLast()
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        // d.getFirst()
        // d.getLast()
        System.out.println(d);
        
    }
}
