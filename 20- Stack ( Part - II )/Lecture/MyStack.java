import java.util.Stack;

class MyStack {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if ((ch == ')' && !st.isEmpty() && st.peek() == '(')
                    || (ch == '}' && !st.isEmpty() && st.peek() == '{')
                    || (ch == ']' && !st.isEmpty() && st.peek() == '[')) { // Corrected condition
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        String testString = "(){}[]";
        boolean result = stack.isValid(testString);
        System.out.println("The string " + testString + " is valid: " + result);
    }
}