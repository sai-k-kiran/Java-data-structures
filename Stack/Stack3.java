// JavaProgram to convert prefix to postfix

import java.util.*;

public class Stack3 {
    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
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

                String p = p1 + p2 + c;

                stack.push(p);
            } else {
                stack.push(c + "");
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Postfix: " + convert(exp));
    }
}

// Postfix: the operator appears in the expression after the operands. Simply of
// the form (operand1 operand2 operator).
// Example : AB+CD-* (Infix : (A+B * (C-D) )