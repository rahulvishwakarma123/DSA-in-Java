import java.util.ArrayList;

public class PairSum {
    public static void pairSum(ArrayList<Integer> al, int target){
        int start = 0;
        int end = al.size() - 1;
        while (start < al.size() && end > 0) {
            if (al.get(start) + al.get(end) == target) {
                System.out.println("Indices are -> " + start + " And " + end);
                return;
            }
            else if (al.get(start) + al.get(end) > target) {
                end--;
            }
            else{
                start++;
            }
        }
        System.out.println("There is not any pair to form the target");
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int elem = 6;
        int target = 5;
        for (int i = 0; i <= elem; i++) {
            al.add(i);
        }
        pairSum(al, target);
    }
}
