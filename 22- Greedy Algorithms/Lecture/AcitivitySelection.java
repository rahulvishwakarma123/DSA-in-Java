import java.util.*;

public class AcitivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 55, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // End time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        // 1st activvity 
        maxAct = 1;
        ans.add(activities[0][0]); //Index
        int lastEnd = activities[0][2]; 
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                //Activity selected
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum actitivity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    
    }
}