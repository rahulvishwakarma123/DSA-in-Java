import java.util.ArrayList;

public class PairSum2 {
    // pair sum in sorted rotated ArrayList.
    public static void pairSum(ArrayList<Integer> al, int target){
        int n = al.size();
        int bp = 0;
        for (int i = 0; i < n; i++) {
            if (i == al.size()) {
                break;
            }
            if (i < n-2 && al.get(i+1) < al.get(i)) {
                bp = i;
            }
        }
        System.out.println(bp);
        int start = bp + 1;
        int end = bp;


        while (start != end) {
            if (al.get(start) + al.get(end) == target) {
                System.out.println("Indices are -> " + start + " And " + end);
                return;
            }
            else if (al.get(start) + al.get(end) > target) {
                end = (n + end - 1) % n;
            }
            else{
                start = ( start + 1 ) % n;
            }
        }
        System.out.println("There is not any pair to form the target");
        

        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int target = 16;
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        pairSum(al, target);
    }
}
