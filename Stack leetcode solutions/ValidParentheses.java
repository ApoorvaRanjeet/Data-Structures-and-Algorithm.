import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> leftSymbols = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            } else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            } else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses in = new ValidParentheses();
        String s = "({[]})";
        boolean ans = in.isValid(s);
        System.out.print(ans);
    }
}
