public class DecToBin {
    public static void main(String[] args) {
        int n = 10;
        int pow = 0;
        int bin = 0;
        while (n>0) {
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            n = n/2;
            pow++;
            
            System.out.println(bin);
        }
    }
}
