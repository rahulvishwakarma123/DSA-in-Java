public class BinToDec {

    public static void binToDec(int n){
        int pow = 0;
        int dec = 0;
        while (n>0) {
            int ld = n%10;
            n /= 10;
            dec = dec + (ld * (int)Math.pow(2, pow));
            pow++;
        }
        System.err.println(dec);
    }
    public static void main(String[] args) {
        int n = 10011;
        binToDec(n);
    }
}
