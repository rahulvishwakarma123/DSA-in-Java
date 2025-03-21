import java.util.ArrayList;
public class MultiDiamentionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // mainList.add(list1);
        
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);

        // // to print the 2D Arraylist
        // for (int i = 0; i < mainList.size(); i++) {
        //     for (int j = 0; j < mainList.get(i).size(); j++) {
        //         System.out.print(mainList.get(i).get(j));
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println("printing 2d arrayList in 1D");
        System.out.println(mainList);

        System.out.println();
        

        System.out.println("printing mulidimensional arraylist from nested loop");
        
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j)+ " ");
            }
            System.out.println();
            
        }
    }
}
