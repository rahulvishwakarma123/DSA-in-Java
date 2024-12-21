//print the following 0-1 triangle pattern.
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.Scanner;

public class Q4 {

    public static void pattern(int n){      //Fucntion definition

        //outer loop.
        for(int i = 1; i<=n;i++){
            //inner loop
            for(int j = 1; j<=i; j++){
                if ((i+j)%2==0) {
                    System.err.print("1 ");
                }else{
                    System.err.print("0 ");
                }
            }
            System.err.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to print the 0-1 triangle pattern.");
        int n = sc.nextInt();

        pattern(n); //Function call
        
        sc.close();

    }
}
