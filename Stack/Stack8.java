// Check for Balanced Brackets in an expression (well-formedness) using Stack

import java.util.Stack;

public class Stack8 {

    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (c) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(') {
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '[' || check == '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[(])";
        System.out.println(balancedBrackets(str));
    }
}
