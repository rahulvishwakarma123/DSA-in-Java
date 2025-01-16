import java.util.*;
public class QueueUsingDeque {

    static class Queue{
        Deque<Integer> d = new LinkedList<>();
        //ADD
        public void add(int data){
            d.addLast(data);
        }
        //PEEK
        public int peek(){
            return d.getFirst();
        }
        //REMOVE 
        public int remove(){
            return d.removeFirst();
        }
        // IsEpmty
        public boolean isEmpty(){
            return d.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}