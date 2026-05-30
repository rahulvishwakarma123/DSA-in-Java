import java.util.*;
public class name {
    public static void main(String args[]){
        // here we are taking the character as input`
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        char character;
        character = sc.nextLine().charAt(0);
        System.out.println(character);
        sc.close();
    }
}
