import java.util.*;

public class StackUsingDeque {
    static class Stack{
        Deque<Integer> d = new LinkedList<>();
        
        // PUSH
        public void push(int data){
            d.addLast(data);
        }

        //POP
        public int pop(){
            return d.removeLast();
        }

        //PEEK
        public int peek(){
            return d.getLast();
        }

        //isEmpty
        public boolean isEmpty(){
            return d.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(3);
        s.push(2);
        s.push(4);
        
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}