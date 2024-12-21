public class StringSubSet {
    public static void stringSubSet(String str, String ans, int i){     // print the subset of the string
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //recursion
        //yes choice
        stringSubSet(str, ans+str.charAt(i), i+1);
        //no choice
        stringSubSet(str,ans,i+1); 
    }
    
    public static void main(String[] args) {
        String str = "abc";
        stringSubSet(str, "", 0);
    }
}
