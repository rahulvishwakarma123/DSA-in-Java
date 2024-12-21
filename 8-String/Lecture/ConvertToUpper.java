

public class ConvertToUpper {
    
    // Write a program to convert the first letter of each word in a string to uppercase.
    public static StringBuilder convertToUpper(String s){
        StringBuilder sb = new StringBuilder("");

        //for the first letter
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length()-1) {
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb;


    }
    public static void main(String[] args) {
        String s = "Hii, my name is rahul.";
        System.out.println("Your converted String is - " + convertToUpper(s));
        
    }
}
