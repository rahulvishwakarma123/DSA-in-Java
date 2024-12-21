public class LargestString {
    public static String largestString(String s[]){
        String largest = s[0];
        for (int i = 0; i < s.length-1; i++) {
            if(s[i].compareTo(s[i+1]) > 0){
                largest = s[i];
                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String s[] = {"w", "World", "wonderful", "Hello"};

        System.out.println("Largest String = " + largestString(s));


    }
}
