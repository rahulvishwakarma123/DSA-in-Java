import java.util.*;
public class JobSequencing{

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int d, int p, int i){
            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String args[]){
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][1], i));
        }
        
        // Sorting on objects in descendiing order.
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> jobSeq = new ArrayList<>();

        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                jobSeq.add(curr.id);
                time++;
            }
        }

        // Print sequence
        System.out.println("Maximum sequence = " + jobSeq.size());
        for (int i = 0; i < jobSeq.size(); i++) {
            System.out.print(jobSeq.get(i) + " ");
            
        }

    }
}