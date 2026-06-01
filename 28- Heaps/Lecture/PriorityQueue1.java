import java.util.*;
public class PriorityQueue1 {    

    static class Student implements Comparable<Student>{
                                    // -> 'Comparable' is the interface which gives the power to the classes to compare its objects with the help of comparing the keys.
                                    // -> In this Comparable class we have a 'compareTo' function, to compare the objects we redefidened the function or oeverride the fuction.
                                    // we can compare this class's objects on the basis of rank or name.
        int rank;
        String name;
        public Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }

        @Override
        // we compare the objects with the help of this function on the basis of the rank.
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(13, "rahul");
        Student s2 = new Student(23, "vishal");
        Student s3 = new Student(42, "aman");
        Student s4 = new Student(53, "narayan");

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);

        for (Student student : pq) {
            System.out.println(student.name + "->" + student.rank);
        }
        
    }
}
