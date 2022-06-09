// Prefix to Infix Conversion

import java.util.Stack;

public class Stack2 {
    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    public static String convert(String str) {
        Stack<String> stack = new Stack<String>();

        int l = str.length();

        for (int i = l - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String p1 = stack.pop();
                String p2 = stack.pop();

                String p = "(" + p1 + c + p2 + ")";
                stack.push(p);
            } else {
                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix : " + convert(exp));
    }
}

/*
 * Prefix :the operator appears in the expression before the operands. Simply of
 * the form (operator operand1 operand2).
 * Example : *+AB-CD , Infix : (A+B) * (C-D)
 * 
 * Infix :the operator appears in between the operands in the expression. Simply
 * of the form (operand1 operator operand2).
 * Example : (A+B) * (C-D)
 */
