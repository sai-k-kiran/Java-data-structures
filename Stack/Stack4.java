// JavaProgram to convert postfix to prefix

import java.util.*;

public class Stack4 {
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
                String p1 = stack.peek();
                stack.pop();
                String p2 = stack.peek();
                stack.pop();

                String p = c + p2 + p1;

                stack.push(p);
            } else {
                stack.push(c + "");
            }
        }

        String ans = "";
        for (String i : stack) {
            ans += i;
        }
        return ans;
        // return stack.pop(); THIS WILL WORK TOO
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
        System.out.println("Prefix: " + convert(exp));
    }
}
