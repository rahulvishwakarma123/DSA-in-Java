
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nEnter any number:");
            int num = sc.nextInt();
            if (num%10 == 0) {
                System.out.println("Your number didn't printed because it is divisible by 10.");
                System.out.println("Enter 101 to Exit.");
                
                continue;
            }
            else if(num == 101){
                System.out.println("Welcome you are Exit.");
                break;
            }
            else{
                System.out.println("Your number is :" + num);                
                System.out.println("Enter 101 to Exit.");
            }
        }
        sc.close();

    }
}
