//Write a program that reads a integers, and then prints the factorial of the integer.

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print the factorial of the number:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i >= 1; i--){
            fact *= i;
        }
        System.out.println("The factorial of the number is :" + fact);
        sc.close();
    }    
}
