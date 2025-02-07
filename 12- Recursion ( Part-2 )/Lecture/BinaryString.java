public class BinaryString {
    // print all binary string of size N without consecutive ones.
    public static void binString(int N, int lastBit,String s){
        if (N == 0) {
            System.out.println(s);
            return;
        }
        binString(N-1, 0, s+"0");
        if(lastBit == 0){
            binString(N-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        binString(n, 0, "");
        
    }
}
