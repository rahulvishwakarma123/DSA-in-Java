public class BitManipulation {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        
        // AND operator
        int andResult = a & b;  // 0001 in binary, which is 1
        System.out.println("AND Operation: " + andResult);

        // OR operator
        int orResult = a | b;  // 0111 in binary, which is 7
        System.out.println("OR Operation: " + orResult);

        // NOT operator
        int notResult = ~a;  // 1010 in binary (2's complement), which is -6
        System.out.println("NOT Operation: " + notResult);

        // Left shift operator
        int leftShiftResult = a << 1;  // 1010 in binary, which is 10
        System.out.println("Left Shift Operation: " + leftShiftResult);
        
        // Right shift operator
        int rightShiftResult = a >> 1;  // 0010 in binary, which is 2
        System.out.println("Right Shift Operation: " + rightShiftResult);
    }
}
