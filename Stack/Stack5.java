// Postfix to Infix

import java.util.*;

public class Stack5 {
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

        for (int i = 0; i < l; i++) {
            char c = str.charAt(i);

            if (isOperator(c)) {
                String p1 = stack.pop();

                String p2 = stack.pop();

                String p = "(" + p2 + c + p1 + ")";

                stack.push(p);
            } else {
                stack.push(c + "");
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "AB*C+";
        System.out.println("Postfix: " + convert(exp));
    }
}
