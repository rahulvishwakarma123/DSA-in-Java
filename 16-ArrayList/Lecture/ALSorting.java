import java.util.ArrayList;
import java.util.Collections;

public interface ALSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element operation - O(1)
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println(list);
        

        System.out.println("printing in ascending order.");
        Collections.sort(list);
        System.out.println(list);
        
        System.out.println("printing in descending order.");
                              //comparator
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
