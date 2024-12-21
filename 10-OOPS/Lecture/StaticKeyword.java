public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Saraswati vidya mandir.";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        
    }
}

class Student{
    String name;
    int age;

    // Static keyword for this property to share form all the objects.
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
