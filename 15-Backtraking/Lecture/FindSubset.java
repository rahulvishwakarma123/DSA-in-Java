public class FindSubset {
    public static void printSubString(String s, int index,String ans){
        if (index >= s.length()) {
            System.out.println(ans);
            return;
        }
        printSubString(s, index+1,ans+s.charAt(index));
        printSubString(s, index+1,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubString(s, 0, "");
    }
}
