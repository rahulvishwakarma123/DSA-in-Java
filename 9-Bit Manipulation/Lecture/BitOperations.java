public class BitOperations {

    // Get the ith bit
    public static int getBit(int num, int i) {
        return (num & (1 << i)) != 0 ? 1 : 0;
    }

    // Set the ith bit
    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    // Clear the ith bit
    public static int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    // Update the ith bit to a given value (0 or 1)
    public static int updateBit(int num, int i, int value) {
        int mask = ~(1 << i);
        return (num & mask) | (value << i);
    }

    // Clear the last i bits
    public static int clearLastIBits(int num, int i) {
        int mask = ~((1 << i) - 1);
        return num & mask;
    }

    // Clear bits in the range from i to j (inclusive)
    public static int clearRangeOfBits(int num, int i, int j) {
        int a = ~0 << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        return num & mask;
    }

    // Check if a number is odd or even
    public static boolean isOdd(int num) {
        return (num & 1) != 0;
    }

    // Check if a number is a power of 2
    public static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    // Count the number of set bits (1s) in a number
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    // Fast exponentiation
    public static int fastExponentiation(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 29; // Example number for bit operations
        int i = 2; // Example bit position
        int j = 4; // Example bit position for range

        System.out.println("Get bit at position " + i + ": " + getBit(num, i));
        System.out.println("Set bit at position " + i + ": " + setBit(num, i));
        System.out.println("Clear bit at position " + i + ": " + clearBit(num, i));
        System.out.println("Update bit at position " + i + " to 1: " + updateBit(num, i, 1));
        System.out.println("Clear last " + i + " bits: " + clearLastIBits(num, i));
        System.out.println("Clear bits from position " + i + " to " + j + ": " + clearRangeOfBits(num, i, j));
        System.out.println("Is " + num + " odd?: " + isOdd(num));
        System.out.println("Is " + num + " a power of two?: " + isPowerOfTwo(num));
        System.out.println("Number of set bits in " + num + ": " + countSetBits(num));
        System.out.println("Fast exponentiation of 2^3: " + fastExponentiation(2, 3));
    }
}