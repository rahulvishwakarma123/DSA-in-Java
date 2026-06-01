import java.util.ArrayList;
import java.util.List;

public class HeapsLesson {

    static class Heap{
        static List<Integer> list = new ArrayList<>();

        // time complexity = O(logn)
        public void add(int data){
            list.add(data);

            int childIdx = list.size() - 1;
            int parIdx = (childIdx - 1) / 2;

            while (list.get(parIdx) > list.get(childIdx)){
                int temp = list.get(childIdx);
                list.set(childIdx, list.get(parIdx));
                list.set(parIdx, temp);   

                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
            
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(6);
        hp.add(10);
        hp.add(1);
    }
}
