import java.util.ArrayList;
public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        
        int index1 = 0;
        int index2 = 4;
        
        int temp = list.get(index1);

        // swaping
        list.set(index1,list.get(index2));
        list.set(index2,temp);
        System.out.println(list);
    }
}
