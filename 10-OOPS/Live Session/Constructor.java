
class Student{
    String name;
    int age;
    int arr[];
    
    //shallow copy
    // Student (int arr[]){
    //     this.arr = arr;
    // }

    //deep copy 
    Student(int arr[]){
        this.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    Student(String name, int age){
        this.name = name;
        this.age  = age;
    }
    // Copy constructor
    Student(Student obj){
        this.name = obj.name;
        this.age = obj.age;
    }
}


public class Constructor {
    public static void main(String[] args) {
        
    }
}


