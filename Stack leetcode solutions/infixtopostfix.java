import java.util.Stack;
public class infixtopostfix 
{
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    // Method to convert infix expression to postfix expression
    public static String infixToPostfix(String exp) {
        // Initializing an empty String for result
        String result = new String("");
        
        // Initializing empty stack
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            
            // If the scanned character is an operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            // If the scanned character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is ')', pop and output from the stack
            // until an '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                // An operator is encountered
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        
        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression"; // Invalid expression if there are unmatched parentheses
            }
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String exp1 = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp1)); // Output: abcd^e-fgh*+^*+i-
        
        String exp2 = "A*(B+C)/D";
        System.out.println(infixToPostfix(exp2)); // Output: ABC+*D/
    }
}
