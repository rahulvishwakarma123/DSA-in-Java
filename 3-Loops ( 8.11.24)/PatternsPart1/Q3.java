// Print inverted half pyramid with number pattern.
// 4321
// 321
// 21
// 1

import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number.");
        int num = sc.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++ ){
                System.err.print(j);
            }
            System.err.println();
        }
        sc.close();
        
    }
}
