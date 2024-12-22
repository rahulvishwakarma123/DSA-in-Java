//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int even = 0, odd = 0;
        
        for(int i = 1; i<=num; i++){
            if (i%2 == 0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("Sum of the even numbers are : " + even);
        System.out.println("Sum of the odd numbers are : " + odd);
        
        sc.close();
    }
}
