//Write a program that prints the multiplication table of any number.
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to print the table of the number:");
        int num = sc.nextInt();

        System.out.println("Your table is :-");
        

        for(int i = 0; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        
        sc.close();
    }
}
