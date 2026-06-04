import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

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
    // leetcode 973
    public static int[][] kClosest(int[][] arr, int k) {
        int n = arr.length;
        HashMap<Integer, int[]> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int x = arr[i][0];
            int y = arr[i][1];
            int dist = (x*x) + (y*y);
            hm.put(dist, arr[i]);
            pq.add(dist);
        }
        int res[][] = new int[k][2];
        for(int i = 0; i <= k; i++){
            res[i] = hm.get(pq.remove());
        }
        return res;
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
