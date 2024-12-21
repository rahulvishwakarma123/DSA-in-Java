public class ReverseNumber{
    public static void main(String[] args) {
        int n = 10899;
        int revers = 0;
        while (n>0) {
            int lastDigit = n%10;
            revers = (revers*10) + lastDigit;
            n = n/10; 
        }
        System.out.println(revers);
        
    }
}
