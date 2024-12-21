
import java.util.ArrayList;

public class CustomList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(1,9);   //O(n)

        System.out.println(list);   //you can't print arrays like this.


        // get element opertation - O(1)
        // int Elm = list.get(2);
        // System.out.println(Elm);



        // Remove element operation - O(n)
        // list.removeFirst();
        // System.out.println("Removing first element.");
        // System.out.println(list);
        
        
        // list.remove(Elm);
        // System.out.println("Removing 2nd index element.");
        // System.out.println(list);
        
        //set element  - O(n)
        list.set(2,10);
        System.out.println(list);


        //Contains element -O(n)
        System.out.println(list.contains(11));
        System.out.println(list.contains(10));
        

        
        
        
    }
}