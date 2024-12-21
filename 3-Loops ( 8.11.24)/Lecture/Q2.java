
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number divisible of 10 to Exit.");
            int num = sc.nextInt();
            System.out.println("Your number is :" + num);
            if (num%10 ==0 ) {
                System.out.println("Welcome you exit the Loop.");
                break;
            }
        }
        sc.close();

    }
}
